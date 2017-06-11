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
    var movie = list[0];

    for(var i = 0; i < list.length; i++){
        console.log(i);
    }
    var html = "";
    html += analyse(movie);

    $("#item-container").append(html);
}/**
 * Created by yuminchen on 2017/6/11.
 */