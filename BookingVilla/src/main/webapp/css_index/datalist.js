class villa {
    constructor(img, price, level, area, width, deep, map, bedroom, kitchen, living, toilet, relax, gym, garage) {
        this.img = img;
        this.price = price;
        this.level = level;
        this.area = area;
        this.width = width;
        this.deep = deep;
        this.map = map;
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        this.living = living;
        this.toilet = toilet;
        this.relax = relax;
        this.gym = gym;
        this.garage = garage;
    }
    getImg(){
        return this.img;
    }
    getPrice(){
        return this.price;
    }
    getLevel(){
        return this.level;
    }
    getArea(){
        return this.area;
    }
    getWidth(){
        return this.width;
    }
    getDeep(){
        return this.deep;
    }
    getMap(){
        return this.map;
    }
    getBedroom(){
        if(this.bedroom == 0){
            return 0;
        } else {
            return "Phòng ngủ : " + this.bedroom;
        }
    }
    getKitchen(){
        if(this.kitchen == 0){
            return 0;
        } else {
            return "Phòng bếp : " + this.kitchen;
        }
    }
    getLiving(){
        if(this.living == 0){
            return 0;
        } else {
            return "Phòng khách : " + this.living;
        }
    }
    getToilet(){
        if(this.toilet == 0){
            return 0;
        } else {
            return "Phòng vệ sinh : " + this.toilet;
        }
    }
    getRelax(){
        if(this.relax == 0){
            return 0;
        } else {
            return "Phòng giải trí : " + this.relax;
        }
    }
    getGym(){
        if(this.gym == 0){
            return 0;
        } else {
            return "Phòng gym : " + this.gym;
        }
    }
    getGarage(){
        if(this.garage == 0){
            return 0;
        } else {
            return "Nhà để xe : " + this.garage;
        }
    }
    setImg(img){
        this.img = img;
    }
    setPrice(price){
        this.price = price;
    }
    setLevel(level){
        this.level = level;
    }
    setArea(area){
        this.area = area;
    }
    setWidth(width){
        this.width = width;
    }
    setDeep(deep){
        this.deep = deep;
    }
    setMap(map){
        this.map = map;
    }
    setBedroom(bedroom){
        this.bedroom = bedroom;
    }
    setKitchen(kitchen){
        this.kitchen = kitchen;
    }
    setLiving(living){
        this.living = living;
    }
    setToilet(toilet){
        this.toilet = toilet;
    }
    setRelax(relax){
        this.relax = relax;
    }
    setGym(gym){
        this.gym = gym;
    }
    setGarage(garage){
        this.garage = garage;
    }
}
let array = [
    new villa(["https://drive.google.com/uc?id=1NxHAgMfX2XX_eA34oiithxv97a6VopTF",
            "https://drive.google.com/uc?id=1i0xsOs4WqAxVebKeQKwspQmXtlMuRo4M",
            "https://drive.google.com/uc?id=1tkKXQbLsC7CxLsPkyGCqEqQ5Bf-NUyNa",
            "https://drive.google.com/uc?id=1OGBoS97BiZafmRA102Imud62uLatx_RN",
            "https://drive.google.com/uc?id=1Oor-TJD7-uo9e96xA3I_vKoNzcDndyES"],
        2700000,3,540,15,12,
    "https://drive.google.com/uc?id=1nc-sqvrPl7lxW4GggOJZQjyp0a5AC7yo",
        5,1,1,3,1,0,0),

    new villa(["https://drive.google.com/uc?id=1xe9Q-lGyPQbx8IObBKTb7D4hjdAG0WEF",
            "https://drive.google.com/uc?id=1eBa5t2pUvcuchwwM2tWTzwEb8l4FBMTn",
            "https://drive.google.com/uc?id=1PN-UTWQSb8LIluKaHXLfcIbHlCn_RRa1",
            "https://drive.google.com/uc?id=1_7EjJ5GDC1v7w4v6JYURh8X6193l6zkL",
            "https://drive.google.com/uc?id=1xEx3cNkDFngFh9oD24uY0UaEnDgNmApz",
            "https://drive.google.com/uc?id=1iIms_wazyYYlJ06j3Y-cORgtKcki8iH3"],
        4410000,4,882,20,14,
        "https://drive.google.com/uc?id=1lnQTdeFfqaiwTSDCDR8IRxBmVSQJe_97",
        7,1,1,5,2,1,0),
    new villa(["https://drive.google.com/uc?id=1TKVJr4cn-SYWjac9crrcp7uiSiz1TwI1",
            "https://drive.google.com/uc?id=1U-gyDldJMduxBv5_xQWGVJnsLG71jMCd",
            "https://drive.google.com/uc?id=1jOI60Kk_1gw8GeObTsUxwT152AdeB0dT",
            "https://drive.google.com/uc?id=1ZIu6KE_2dte4zaR0NHdTNGCZ2CyK3q8I",
            "https://drive.google.com/uc?id=1DB2qafko4m78EGS_f6Dw3CVWNJyvjAG0"],
        2560000,3,512,12.5,20.5,
        "https://drive.google.com/uc?id=13FMm1rmxofoEkBhedjDP16skMh394NVc",
        3,1,1,4,1,1,1),
    new villa(["https://drive.google.com/uc?id=1xKSwa95gvCvhj4lF7UUL-DZHqzfYYL6i",
            "https://drive.google.com/uc?id=1ZzYV5qZIdrZ1S2FwSSIIef6nPOb9wESJ",
            "https://drive.google.com/uc?id=1TfW3cbQl99vpoMtyClwWJ0TA8EnstZhm",
            "https://drive.google.com/uc?id=1sS6m1UQyt-_rfJ7rqyT389le7p0rT4bh",
            "https://drive.google.com/uc?id=17ZGnoyO3Q81Z-DaFU1_4wz8cYEqkv-Op"],
        1390000,2,278,13.2,10.5,
        "https://drive.google.com/uc?id=1P5X9amlwKkUbMxYe8qstluKu_hmLVDQM",
        4,1,1,4,0,0,0),
    new villa(["https://drive.google.com/uc?id=1H8XRHhXZkxuxCjUJMyUzVXyzZjNxEkVE",
            "https://drive.google.com/uc?id=1jGg_3Bnj_u3-1YuGgN_MhUClsIscdCJI",
            "https://drive.google.com/uc?id=1M6cPBuLKeJobbrQENn3VL6DDAGjWdyaK",
            "https://drive.google.com/uc?id=1Fb97M_DjXVNsRHaqaB48ldC0U2IxWi-t",
            "https://drive.google.com/uc?id=1_q1a1vjO2C59yExnYHwCgUSHv1ClX_p0",
            "https://drive.google.com/uc?id=1qNhiRbJGZdbqU2FtO_SXoIwPE389MZz_"],
        2700000,3,540,12.5,20.5,
        "https://drive.google.com/uc?id=1Q2N6rGUdt_DAW4JeiEsXdlVFOREW02EJ",
        5,1,1,6,0,1,0),
    new villa(["https://drive.google.com/uc?id=1HSHCa3tgF8LncIjVTk0y7JxrLT1G3f6Z",
            "https://drive.google.com/uc?id=1XRkKJtEm791L7sNJAbWJRkuBWVUc7RD3",
            "https://drive.google.com/uc?id=1VOcum21hyQ7cguPyIaiNwLpySGv2AP5o",
            "https://drive.google.com/uc?id=1iwqB8qrqyAUNVWY6Lp8aSiff4AV3-RPi",
            "https://drive.google.com/uc?id=1ig_5jPgx0jDfxYe3_VDRnwX5ZgSEVJfS"],
        1870000,3,374,12,14,
        "https://drive.google.com/uc?id=1rR5IICzPMgitkEx9i3OelWfjsIabRFxR",
        4,1,1,4,0,0,0),
    new villa(["https://drive.google.com/uc?id=11BoXW1litPYFnU3XFtiXHrdhzN6mJmZ8",
            "https://drive.google.com/uc?id=1En7aWsz2zzkuqBPZM0X_ef1oR3egZxoQ",
            "https://drive.google.com/uc?id=1_pm_cdsc_lfNw2IyPhCEcnuN10PCzf88",
            "https://drive.google.com/uc?id=1BOINbgJMeTtPNlbEcsHe39muq1jZcM__",
            "https://drive.google.com/uc?id=1APfnsd07iP_nnQSK8ww-xTvqacbNxZ6O",
            "https://drive.google.com/uc?id=1g1thQafVhwBWtg1hMr8pceIyOC2X821H",
            "https://drive.google.com/uc?id=1cHoFynG1KqxQWvYcf_BHkNtRUBGwtpIN"],
        3690000,4,738,22.5,16.3,
        "https://drive.google.com/uc?id=15iuFjzJubATp_yzFWufnr5OTgLxVMiGn",
        6,1,1,5,0,1,0),
    new villa(["https://drive.google.com/uc?id=1I3JMgAGrwlRbMlrScB0kqR99s49RirV7",
            "https://drive.google.com/uc?id=1VzP88vpqYR28QS1pmBU3CCjVsTY2Ben4",
            "https://drive.google.com/uc?id=1DI8hC_k4cuml_HX_WkVfimnODkXQOxG-",
            "https://drive.google.com/uc?id=1mbTogWKgiNnM2MtWPiNuyWLFAwtJ57bY"],
        2325000,3,465,8.5,18,
        "https://drive.google.com/uc?id=1IvGoqItZmiMmnkifriCvte_KK_m9-7Od",
        3,1,1,3,2,1,0),
    new villa(["https://drive.google.com/uc?id=1cprUb-02yCtAv-tFPXlhOe-cEw_0FyTg",
            "https://drive.google.com/uc?id=1ljYMcWznDMm_-v_OUrruKs6aNiAsl3AJ",
            "https://drive.google.com/uc?id=1vMUQgFLOfi6ekA4tSD8UZY1dQMtDOYCk",
            "https://drive.google.com/uc?id=1Au4dgCtFbiWu8-6QPDz7_9jhxfmLGCve",
            "https://drive.google.com/uc?id=185YTYODuaBL7gDW3ZpkpfE_Se2I72P9p",
            "https://drive.google.com/uc?id=1T8KCfom9Yl8MJgeWPaVsUiyoDG254DKt",
            "https://drive.google.com/uc?id=1nCeCUGPbgLlcKgygUZRz8QNqomGV4p1d"],
        5710000,2,1142,19,28,
        "https://drive.google.com/uc?id=1T5PhRdRVqeH0BzkBj80aVEIjrovtzaG0",
        8,1,1,7,0,0,1),
    new villa(["https://drive.google.com/uc?id=1ZjlEDHtdaS_TJrDm_Qk_0fPd1LDd30pG",
            "https://drive.google.com/uc?id=1Rs5pyMK2eBAnMwVHd9iGLJthX-IMdqOi",
            "https://drive.google.com/uc?id=10fOZgpMlZyuo47xIDzUaX9S6gGWqmWGd",
            "https://drive.google.com/uc?id=1Sik_S1SOIsUn4lbSeu4ZsZP9e1DtzFDj",
            "https://drive.google.com/uc?id=17GbcuFOa4t_36Bo8cCmsQynE9xtsKgbe",
            "https://drive.google.com/uc?id=1FyuARERKJcUjMmVC3m9Db40ctcyBhNSq",
            "https://drive.google.com/uc?id=1jObNvjYuzlElEflfC7SFlaJQK-ENPO-i",
            "https://drive.google.com/uc?id=1u2Q2Ki_GViZbU-OUDj_Udv4Rqd5dwy5i"],
        3730000,3,746,17.2,13.3,
        "https://drive.google.com/uc?id=1EEkZ-sZsolg7kQ2VT18ZUIe1aAHGOWDK",
        6,1,1,6,0,0,1)
]
let intervalList = [];
function updateVillaList(){
    let data = "";
    for (let i = 0; i < array.length; i++){
        let villa = array[i];
        data +=
            `<div class="villa boxshadow-outset" onmouseover="hoverVilla(${i})" onmouseleave="stopHover(${i})">
                <div class="villa-description">
                    <p>Diện tích : <span class="villa-description-text">${villa.getArea()}</span> m<sup>2</sup></p>
                    <p>Số tầng : <span class="villa-description-text">${villa.getLevel()}</span> tầng</p>
                    <p>Chiều ngang : <span class="villa-description-text">${villa.getWidth()}</span> m</p>
                    <p>Chiều sâu : <span class="villa-description-text">${villa.getDeep()}</span> m</p>
                </div>
                <div class="villa-picture" id="villa-${i}" style="background-image: url('${villa.getImg()[0]}')"></div>
                <div class="villa-map"></div>
                <div class="villa-price">
                    <p onclick="detailVilla(${i})" class="backgroundcolor-4 hover">Booking : ${toPriceString(villa.getPrice())}</p>
                </div>
            </div>`
    }
    document.getElementById("villa-list").innerHTML = data;
}
function toPriceString(str){
    str += "";
    let result = "";
    for (let i = 0; i < str.length; i++){
        result = str[str.length - 1 - i] + result;
        if (i % 3 == 2 && i + 1 != str.length){
            result = "," + result;
        }
    }
    return result + " / ngày";
}
function hoverVilla(index){
    let item = document.getElementById("villa-" + index);
    let count = 0;
    let image = array[index].getImg();
    let interval = setInterval(function () {
        count = (count + 1) % image.length;
        item.style.backgroundImage = `url('${image[count]}')`;
    },1300);
    intervalList.push(interval);
}
function stopHover(index){
    let item = document.getElementById("villa-" + index);
    let image = array[index].getImg();
        item.style.backgroundImage = `url('${image[0]}')`;
        for (let i = 0; i < intervalList.length;i++){
            clearInterval(intervalList[i]);
        }
        intervalList = [];
}
updateVillaList();
function detailVilla(index){
    let villa = array[index];
    let board = document.getElementById("detail-board");
    let close = document.getElementById("close-detail-board");
    let map = document.getElementById("map");
    board.style.display = "grid";
    close.style.display = "block";
    map.style.backgroundImage = `url(${villa.getMap()})`;
    let dataArray = "";
    for (let i = 0; i < villa.getImg().length; i++){
        dataArray += `<img onclick="change_main_img('${villa.getImg()[i]}')" class="image-array boxshadow-outset hover-in" src="${villa.getImg()[i]}">`
    }
    document.getElementById("detail-board-picture-array-branch").innerHTML = dataArray;
    document.getElementById("detail-board-booking-price").innerHTML = "Booking : " + toPriceString(villa.getPrice());
    let dataMainPicture = villa.getImg()[0];
    document.getElementById("detail-board-picture-array-main").style.backgroundImage = `url("${dataMainPicture}")`;
    let description = [];
    let dataFull = ["Diện tích : " + villa.getArea() + " m<sup>2</sup>","Số tầng : " + villa.getLevel(),
        "Chiều dài : " + villa.getWidth() + " m", "Chiều sâu : " + villa.getDeep() + " m",villa.getKitchen(),
        villa.getBedroom(),villa.getLiving(),villa.getToilet(),villa.getRelax(),villa.getGym(),
        villa.getGarage()];
    for (let i = 0; i < dataFull.length; i++){
        if (dataFull[i] != 0){
            description.push(dataFull[i]);
        }
    }
    let dataDescription = "";
    let numberItem = Math.ceil(description.length / 2);
    for (let i = 0; i < description.length; i++){
        if (i % numberItem == 0){
            dataDescription += `<tr>`;
        }
        dataDescription += `<td style="width: ${100 / numberItem}%"><p class="backgroundcolor-2">${description[i]}</p></td>`;
        if (i == description.length - 1 || i % numberItem == numberItem - 1){
            dataDescription += `</tr>`;
        }
    }
    document.getElementById("table-description").innerHTML = dataDescription;
}
function close_detail_board(){
    let board = document.getElementById("detail-board");
    board.style.display = "none";
}
function change_main_img(link){
    document.getElementById("detail-board-picture-array-main").style.backgroundImage = `url("${link}")`;
}