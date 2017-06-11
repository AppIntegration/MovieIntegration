<!-- 一些常量 -->
var DOUBAN_LOGO = "/img/douban.png";
var DOUBAN = "豆瓣";
var TIME_LOGO = "/img/time.jpeg";
var TIME = "时光网";
var IMDB_LOGO = "/img/imdb.jpeg";
var IMDB = "IMDB";

<!-- 一部电影 -->
function analyse(item) {
    var html = "";
    html += '<div class="feature-area">';
    html += '<div class="container">';

    html += title("加勒比海盗");
    html += image("/img/banner/timg.jpeg");

    html += '<div class="row" style="margin-top: 20px">';
    html += frame(DOUBAN_LOGO, DOUBAN, "导演： 戈尔·维宾斯基", "片长：143分钟", "类型：动作 / 奇幻 / 冒险", "评分：8.6");
    html += frame(TIME_LOGO, TIME, "导演： 戈尔·维宾斯基", "片长：143分钟", "类型：动作/冒险/奇幻", "评分：8.3");
    html += frame(IMDB_LOGO, IMDB, "导演： Gore Verbinski", "片长：2h 23min ", "类型：Action, Adventure, Fantasy", "评分：8.0");
    html += '</div>';

    html += '</div>';
    html += '</div>';

    return html;
}

<!-- 标题部分 -->
function title(title) {
    var html = "";
    html += '<div class="row">';
    html += '<div class="col-md-12">';
    html += '<div class="section-heading">';

    html += '<h3>' + title + '</h3>';

    html += '</div>';
    html += '</div>';
    html += '</div>';

    return html;
}

<!-- 海报部分 -->
function image(url) {
    var html = "";
    html += '<div class="row">';
    html += '<div class="col-md-4 col-xs-12 col-md-offset-4">';
    html += '<div class="single-banner wow fadeIn" data-wow-duration=".5s" data-wow-delay=".5s">';

    html += '<a href="#">' + '<img src="' + url + '" alt="" />' + '</a>';

    html += '</div>';
    html += '</div>';
    html += '</div>';

    return html;
}

<!-- 信息框部分 -->
function frame(url, source, director, length, type, score) {
    var html = "";
    html += '<div class="col-md-4 col-xs-12">';
    html += '<ul class="list-group">';

    html += '<li class="list-group-item website">' + '<img src="' + url + '" class="website_logo"/>' + source + '</li>';
    html += '<li class="list-group-item">' + director + '</li>';
    html += '<li class="list-group-item">' + length + '</li>';
    html += '<li class="list-group-item">' + type + '</li>';
    html += '<li class="list-group-item">' + score + '</li>';

    html += '</ul>';
    html += '</div>';

    return html;
}
