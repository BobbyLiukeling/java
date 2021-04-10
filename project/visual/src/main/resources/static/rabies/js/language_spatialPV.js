let engIndex = [
    'Prophylactic Vaccination - Spatial Distribution',
    'Prophylactic Vaccination - Spatial Distribution',
    'Other modules',
    'Human Rabies - Temporal Distribution',
    'Human Rabies - Spatial Distribution',
    'Human Rabies - Crowd Distribution',
    'Prophylactic Vaccination - Temporal Distribution',
    'Time Series Analysis',
    'Home page',
    '中文',
    'Select the time range about year:',
    'Select the data type: ',
    'Data Type',
    'exposed',
    'vaccination',
    'query',

];

let chiIndex = [
    '预防接种 - 空间分布',
    '预防接种 - 空间分布',
    '其他模块',
    '人类狂犬病 - 时间分布',
    '人类狂犬病 - 空间分布',
    '人类狂犬病 -人群分布',
    '预防接种 - 时间分布',
    '时间序列分析',
    '主页',
    '&nbsp;&nbsp;&nbsp;English &nbsp;&nbsp;&nbsp;',
    '选择年限范围：',
    '选择数据最小间隔时间单位：',
    '数据类型',
    '暴露',
    '预防接种',
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
