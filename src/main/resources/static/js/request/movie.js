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

    html += title(item.ename);
    html += image(item.mediumImage);
    // html += image("/img/banner/timg.jpeg");

    html += common(item);

    html += '<div class="row" style="margin-top: 20px">';
    html += dframe("豆瓣编号" + item.doubanId, "豆瓣评分" + item.doubanScore, "豆瓣人数" + item.doubanVote);
    html += tframe("时光评分" + item.timeScore, "时光人数" + item.timeVote);
    html += iframe("IMDB编号" + item.imdbId, "IMDB评分" + item.imdbScore, "IMDB人数" + item.imdbVote);
    html += '</div>';

    html += '</div>';
    html += '</div>';

    return html;
}
<!-- 通用部分 -->
function common(item) {
    var html = "";
    if (item.genres != null) {
        html += '<div>';
        html += "类型：" + item.genres;
        html += '</div>';
    }
    if (item.casts != null) {
        html += '<div>';
        html += "演员： " + item.casts;
        html += '</div>';
    }
    if (item.directors != null) {
        html += '<div>';
        html += "导演： " + item.directors;
        html += '</div>';
    }
    if (item.writers != null) {
        html += '<div>';
        html += "编剧： " + item.writers;
        html += '</div>';
    }
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

<!-- 豆瓣信息框部分 -->
function dframe(id, doubanScore, doubanVote) {
    var html = "";
    html += '<div class="col-md-4 col-xs-12">';
    html += '<ul class="list-group">';

    html += '<li class="list-group-item website">' + '<img src="' + DOUBAN_LOGO + '" class="website_logo"/>' + DOUBAN + '</li>';
    html += '<li class="list-group-item">' + id + '</li>';
    html += '<li class="list-group-item">' + doubanScore + '</li>';
    html += '<li class="list-group-item">' + doubanVote + '</li>';

    html += '</ul>';
    html += '</div>';

    return html;
}

<!-- 时光信息框部分 -->
function tframe(timeScore, timeVote) {
    var html = "";
    html += '<div class="col-md-4 col-xs-12">';
    html += '<ul class="list-group">';

    html += '<li class="list-group-item website">' + '<img src="' + TIME_LOGO + '" class="website_logo"/>' + TIME + '</li>';
    html += '<li class="list-group-item">' + timeScore + '</li>';
    html += '<li class="list-group-item">' + timeVote + '</li>';

    html += '</ul>';
    html += '</div>';

    return html;
}

<!-- IMDB信息框部分 -->
function iframe(id, imdbScore, imdbVote) {
    var html = "";
    html += '<div class="col-md-4 col-xs-12">';
    html += '<ul class="list-group">';

    html += '<li class="list-group-item website">' + '<img src="' + IMDB_LOGO + '" class="website_logo"/>' + IMDB + '</li>';
    html += '<li class="list-group-item">' + id, +'</li>';
    html += '<li class="list-group-item">' + imdbScore + '</li>';
    html += '<li class="list-group-item">' + imdbVote + '</li>';

    html += '</ul>';
    html += '</div>';

    return html;
}