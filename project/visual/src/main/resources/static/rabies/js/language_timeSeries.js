let engIndex = [
    'Time Series Analysis',
    'Time Series Analysis',
    'Other modules',
    'Human Rabies - Temporal Distribution',
    'Human Rabies - Spatial Distribution',
    'Human Rabies - Crowd Distribution',
    'Prophylactic Vaccination - Temporal Distribution',
    'Prophylactic Vaccination - Spatial Distribution',
    'Home page',
    '中文',
    'Analysis and Prediction',
    'Infection of Human rabies',
    'Exposed of Human rabies',
];

let chiIndex = [
    '时间序列分析',
    '时间序列分析',
    '其他模块',
    '人类狂犬病 - 时间分布',
    '人类狂犬病 - 空间分布',
    '人类狂犬病 -人群分布',
    '预防接种 - 时间分布',
    '预防接种 - 空间分布',
    '主页',
    '&nbsp;&nbsp;&nbsp;English &nbsp;&nbsp;&nbsp;',
    '分析与预测',
    '人感染狂犬病',
    '狂犬病暴露',
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
