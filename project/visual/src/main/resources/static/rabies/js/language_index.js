let engIndex = [
    'Human Rabies in Hubei Province',
    'RABIES',
    'Analysis modules',
    'Contact us',
    'Logout',
    '中文',
    'Human Rabies in Hubei Province, China',
    'A visual analysis platform for analyzing human rabies distribution and predicting human rabies development based' +
    'on human rabies surveillance historic data in Hubei Province, China.',
    'learn more',
    'Human Rabies - Temporal Distribution',
    'Human Rabies - Spatial Distribution',
    'Human Rabies - Crowd Distribution',
    'Prophylactic Vaccination - Temporal Distribution',
    'Prophylactic Vaccination - Spatial Distribution',
    'Time Series Analysis',
    'Contact with us',
    'Email: &nbsp;wwt@stu.scu.edu.cn',
    'Organization: &nbsp;College of Computer Science, Sichuan University',
    'Address: &nbsp;No.24 South Section 1, Yihuan Road, Chengdu Sichuan, China, 610065',

];

let chiIndex = [
    '湖北省人类狂犬病',
    '狂犬病',
    '分析模块',
    '联系我们',
    '登出',
    'English',
    '中国湖北省狂犬病',
    '基于中国湖北省人类狂犬病历史监测数据的分布与预测可视化分析平台',
    '更多',
    '人类狂犬病 - 时间分布',
    '人类狂犬病 - 空间分布',
    '人类狂犬病 - 人群分布',
    '预防接种 - 时间分布',
    '预防接种 - 空间分布',
    '时间序列分析',
    '联系我们',
    '邮箱：&nbsp;wwt@stu.scu.edu.cn',
    '单位：&nbsp;四川大学计算机学院',
    '地址：&nbsp;地址：四川省成都市一环路南一段24号，邮编：610065',


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
