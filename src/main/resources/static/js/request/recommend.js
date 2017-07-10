/**
 * Created by kylin on 10/07/2017.
 */
function getRecommend() {
    $.ajax({
        type: "POST",
        url: "/movie/get-recommend",
        data: {
            username: "test-user",
            number: 10
        },
        success: function (data) {
            loadRecommend(data);
        },
        error: function () {
            alert("服务器出现问题，请稍微再试！");
        }
    });
}

function loadRecommend(list){
    $("#recommend-container").empty();

    var html = "";
    if (list.length == 0) {
        showInfo("暂无电影推荐，请为更多的电影打分~");
        return;
    }
    for (var i = 0; i < list.length; i++) {
        var movie = list[i];
        html += analyse(movie);
    }

    $("#recommend-container").append(html);
}