let engIndex = [
    'Human Rabies - Temporal Distribution',
    'Human Rabies - Temporal Distribution',
    'Other modules',
    'Human Rabies - Spatial Distribution',
    'Human Rabies - Crowd Distribution',
    'Prophylactic Vaccination - Temporal Distribution',
    'Prophylactic Vaccination - Spatial Distribution',
    'Time Series Analysis',
    'Home page',
    '中文',
    'Select region in Hubei Province:',
    'select region ',
    'Hubei Province',
    'Enshi City',
    'Ezhou City',
    'Huanggang City',
    'Huangshi City',
    'Jingmen City',
    'Jingzhou City',
    'Qianjiang City',
    'Shennongjia City',
    'Shiyan City',
    'Suizhou City',
    'Tianmen City',
    'Wuhan City',
    'Xiangyang City',
    'Xianning City',
    'Xiantao City',
    'Xiaogan City',
    'Yichang City',
    'Select time range about year: ',
    'Select data unit: ',
    'Year',
    'Quarter',
    'Month',
    'query',

];

let chiIndex = [
    '人类狂犬病 - 时间分布',
    '人类狂犬病 - 时间分布',
    '其他模块',
    '人类狂犬病 - 空间分布',
    '人类狂犬病 -人群分布',
    '预防接种 - 时间分布',
    '预防接种 - 空间分布',
    '时间序列分析',
    '主页',
    '&nbsp;&nbsp;&nbsp;English &nbsp;&nbsp;&nbsp;',
    '选择城市',
    '选择地区',
    '湖北省',
    '恩施市',
    '鄂州市',
    '黄冈市',
    '黄石市',
    '荆门市',
    '荆州市',
    '潜江市',
    '神龙架林区',
    '十堰市',
    '随州市',
    '天门市',
    '武汉市',
    '襄阳市',
    '咸宁市',
    '仙桃市',
    '孝感市',
    '宜昌市',
    '选择年限范围：',
    '选择数据最小间隔时间单位：',
    '年',
    '季度',
    '月',
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
