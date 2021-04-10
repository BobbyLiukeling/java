let engIndex = [
    'Human Rabies - Crowd Distribution',
    'Human Rabies - Crowd Distribution',
    'Other modules',
    'Human Rabies - Temporal Distribution',
    'Human Rabies - Spatial Distribution',
    'Prophylactic Vaccination - Temporal Distribution',
    'Prophylactic Vaccination - Spatial Distribution',
    'Time Series Analysis',
    'Home page',
    '中文',
    'Select the time range about year:',
    'query',

];

let chiIndex = [
    '人类狂犬病 - 人群分布',
    '人类狂犬病 - 人群分布',
    '其他模块',
    '人类狂犬病 - 时间分布',
    '人类狂犬病 - 空间分布',
    '预防接种 - 时间分布',
    '预防接种 - 空间分布',
    '时间序列分析',
    '主  页',
    '&nbsp;&nbsp;&nbsp;English &nbsp;&nbsp;&nbsp;',
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
