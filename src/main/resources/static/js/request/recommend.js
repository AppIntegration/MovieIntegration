/**
 * Created by kylin on 07/07/2017.
 */
function getRecommend() {
    $.ajax({
        type: "GET",
        url: "/movie/getrecommend",

        success: function (data) {
            loadRecommendData(data);
        },
        error: function () {
            alert("服务器出现问题，请稍微再试！");
        }
    });
}

function loadRecommendData(list) {
    // recommend-container
    $("#recommend-container").empty();

    var html = "";
    if(list.length == 0){
        showInfo("没有可以推荐的电影，请给点评更多电影以让我们更加了解您~");
        return;
    }
    for (var i = 0; i < list.length; i++) {
        var movie = list[i];
        html += analyse(movie);
    }

    $("#recommend-container").append(html);

}