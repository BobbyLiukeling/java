let engIndex = [
    'Rabies Exposure - Temporal Distribution',
    'Rabies Exposure - Temporal Distribution',
    'Other modules',
    'Rabies Incidence - Temporal Distribution',
    'Rabies Incidence - Spatial Distribution',
    'Rabies Incidence - Crowd Distribution',
    'Rabies Exposure - Spatial Distribution',
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
    'query',

];

let chiIndex = [
    '狂犬病暴露 - 时间分布',
    '狂犬病暴露 - 时间分布',
    '其他模块',
    '狂犬病发病 - 时间分布',
    '狂犬病发病 - 空间分布',
    '狂犬病发病 -人群分布',
    '狂犬病暴露 - 空间分布',
    '时间序列分析',
    '主页',
    'English',
    '选择城市',
    '选择地区',
    '湖北省',
    '恩施州',
    '鄂州市',
    '黄冈市',
    '黄石市',
    '荆门市',
    '荆州市',
    '潜江市',
    '神农架林区',
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
