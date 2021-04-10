let zwMapHubei = {
    '恩施土家族苗族自治州' : 'Enshi Tujia and Miao Autonomous Prefecture',
    '鄂州市' : 'Ezhou city',
    '黄冈市' : 'Huanggang city',
    '黄石市' : 'Huangshi city',
    '荆门市' : 'Jingmen city',
    '荆州市' : 'Jingzhou city',
    '潜江市' : 'Qianjiang city',
    '神农架林区' : 'Shennongjia Forestry District',
    '十堰市' : 'Shiyan city',
    '随州市' : 'Suizhou city',
    '天门市' : 'Tianmen city',
    '武汉市' : 'Wuhan city',
    '襄阳市' : 'Xiangyang city',
    '咸宁市' : 'Xianning city',
    '仙桃市' : 'Xiantao city',
    '孝感市' : 'Xiaogan city',
    '宜昌市' : 'Yichang city'
}

let zwMapCounty = {

}
function minNum(dataset){
    let min = dataset[0]['value'];
    for(let i in dataset){
        if(dataset[i]['value'] < min)
            min= dataset[i]['value'];
    }
    return min;
}

function maxNum(dataset){
    let max = dataset[0]['value'];
    for(let i in dataset){
        if(dataset[i]['value'] > max)
            max= dataset[i]['value'];
    }
    return max;
}

//解析后台传回来的数据用于地图数据项
function parseDataForMap(data){
    let dataSet = [];
    for(let i in data){
        let anObject = {};
        anObject.name= zwMapHubei[data[i]['region']];
        anObject.value = data[i]['number'];
        dataSet.push(anObject);
    }
    return dataSet;
}

//后台返回数据解析为可直接在Echarts中使用的数组形式，用于时间图
function parseDataForTime(data, type){
    let dataSet = [];
    for(let i in data){
        let anElement = [];
        anElement.push(data[i]['someTime']);
        anElement.push(data[i][type]);
        console.log('anElement: '+anElement);
        dataSet.push(anElement);
    }
    return dataSet;
}
//时间分布x轴坐标提取
function getXAxisForTemporal(data){
    let dataset = [];
    for(let i in data){
        dataset.push(data[i]['someTime']);
    }
    console.log('xAxis:'+dataset);
    return dataset;
}

function parseDataForPerson(data, type){
    let dataSet = [];
    if(type === 'age'){
        dataSet.push(data['infant']);
        dataSet.push(data['children']);
        dataSet.push(data['teenager']);
        dataSet.push(data['youth']);
        dataSet.push(data['middleAge']);
        dataSet.push(data['agedness']);
    }
    if(type === 'sex'){
        dataSet.push(data['male']);
        dataSet.push(data['female']);
    }
    return dataSet;
}

