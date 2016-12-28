/**
 * Created by chenyanfeng on 2015/11/20.
 */
(function ($) {


    $.widget('ui.myLp', {
        options: {
            lpBox: null,
            lpList: null,
            lpItem: null,
            interval:3000
        },
        _create: function () {
            this.lpBox = this.element;
            this.lpList = this.element.find(this.options.lpList);
            this.lpItem = this.element.find(this.options.lpItem);
        },
        _init: function () {
            var index=0,intervalId,_this=this;
            this.lpItemWidth =$(window).outerWidth();
            this.lpBox.css({position: 'relative', overflow: 'hidden'});
            this.lpItem.width( this.lpItemWidth);
            this.lpList.width(this.lpItemWidth * this.lpItem.size()).css({position: 'absolute', top: 0, left: 0});
            this.dianEle = $('<ul class="dians"></ul>').appendTo(this.lpBox);
            for (var i = 0; i < this.lpItem.size(); i++) {
                this.dianEle.prepend($('<li class="dian"></li>'));
            }
            var Dian = this.element.find('.dian');
            this._on(Dian, {
                'mouseenter': function (event) {
                    var thisEle = event.target,
                        thisIndex = Dian.index(thisEle);
                    if(!event.isTrigger){
                        window.clearInterval(intervalId);
                    }
                    this.lpList.stop().animate({left: -this.lpItemWidth * thisIndex}, 300,'easeInCubic');
                    Dian.removeClass('cur');
                    $(thisEle).addClass("cur");
                    index = thisIndex + 1;
                },
                'mouseleave':function(){
                    window.clearInterval(intervalId);
                    intervalId = window.setInterval(function () {
                        go();
                    }, _this.options.interval)
                }
            });
            this._on(this.lpList,{
               'mouseenter':function(){
                   window.clearInterval(intervalId);
               },
                'mouseleave':function(){
                    window.clearInterval(intervalId);
                    intervalId = window.setInterval(function () {
                        go();
                    }, _this.options.interval)
                }
            });
            function go() {
                Dian.eq(index).mouseenter();
                if (index ==_this.lpItem.size()) {
                    index = 0;
                }

            };
            go();
            intervalId = window.setInterval(function () {
                go();
            }, _this.options.interval);

            this._on($(window),{
                'resize':function(){
                    this.lpItemWidth =$(window).outerWidth();
                    this.lpBox.css({position: 'relative', overflow: 'hidden'});
                    this.lpItem.width( this.lpItemWidth);
                    this.lpList.width(this.lpItemWidth * this.lpItem.size()).css({position: 'absolute', top: 0, left: 0});
                    go();
                }
            });
        }
    });


})(jQuery);

$(function () {
    $('.img-box').myLp({
        lpList: '.img-list',
        lpItem: '.img-item',
        interval:5000
    });

});

