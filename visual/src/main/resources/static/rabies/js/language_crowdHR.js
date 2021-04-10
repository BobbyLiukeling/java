let engIndex = [
    'Rabies Incidence - Crowd Distribution',
    'Rabies Incidence - Crowd Distribution',
    'Other modules',
    'Rabies Incidence - Temporal Distribution',
    'Rabies Incidence - Spatial Distribution',
    'Rabies Exposure - Temporal Distribution',
    'Rabies Exposure - Spatial Distribution',
    'Time Series Analysis',
    'Home page',
    '中文',
    'Select the time range about year:',
    'query',

];

let chiIndex = [
    '狂犬病发病 - 人群分布',
    '狂犬病发病 - 人群分布',
    '其他模块',
    '狂犬病发病 - 时间分布',
    '狂犬病发病 - 空间分布',
    '狂犬病暴露 - 时间分布',
    '狂犬病暴露 - 空间分布',
    '时间序列分析',
    '主页',
    'English',
    '选择年限范围：',
    '查询',

];

//读首页内容
function readIndexText(lang){
    if(lang === 'eng'){
        return engIndex;
    }
    else
        return chiIndex;
}
//向网页填充某种语言内容
function showLanguage(lang){
    console.log('进入翻译函数');
    let text = readIndexText(lang)
    //选择所有类名为lang的
    let boxes = document.querySelectorAll('.lang');
    //修改每个lang类的lang属性，并翻译内容
    for(let i=0; i<boxes.length; ++i){
        boxes[i].setAttribute('lang', lang);
        boxes[i].innerHTML = text[i];
    }
}
