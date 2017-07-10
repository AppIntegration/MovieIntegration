/**
 * Created by yuminchen on 2017/6/11.
 */
function search() {
    $.ajax({
        type: "POST",
        url: "/movie/search",
        data: {
            key: $("#search-key").val()
        },
        success: function (data) {
            loadData(data);
        },
        error: function () {
            alert("服务器出现问题，请稍微再试！");
        }
    });
}

<!-- 加载LIST中元素到界面 -->
function loadData(list) {
    $("#item-container").empty();

    var html = "";
    if (list.length == 0) {
        showInfo("2016年未上映该电影");
        return;
    }
    for (var i = 0; i < list.length; i++) {
        var movie = list[i];
        html += analyse(movie);
    }

    $("#item-container").append(html);
}


function showInfo(msg) {
    showTip(msg, 'info');
}
function showSuccess(msg) {
    showTip(msg, 'success');
}
function showFailure(msg) {
    showTip(msg, 'danger');
}


function showTip(tip, type) {
    var $tip = $('#tip');
    $tip.attr('class', 'alert alert-' + type).text(tip).css('margin-left', -$tip.outerWidth() / 2);
    $tip.fadeIn(300).delay(700).fadeOut(300);
}