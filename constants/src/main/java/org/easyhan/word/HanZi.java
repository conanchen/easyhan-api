package org.easyhan.word;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HanZi {
    public static Map<Integer, String[]> STROKE_KEYCODES = new HashMap<Integer, String[]>() {
        {
            //keycode as key
            put(12756, new String[]{"点", "丶", "\u31D4"});
            put(12752, new String[]{"横", "一", "\u31D0"});
            put(12753, new String[]{"竖", "丨", "\u31D1"});
            put(12754, new String[]{"撇", "丿", "\u31D2"});
            put(12751, new String[]{"捺", "乀", "\u31CF"});
            put(12736, new String[]{"提", "㇀", "\u31C0"});
            put(12757, new String[]{"横折", "𠃍", "\u31D5"});
            put(12743, new String[]{"横撇", "㇇", "\u31C7"});
            put(12758, new String[]{"横钩", "乛", "\u31D6"});
            put(11908, new String[]{"横斜钩", "⺄", "\u2E84"});
            put(12742, new String[]{"横折钩", "", "\u31C6"});
            put(12749, new String[]{"横折弯", "㇍", "\u31CD"});
            put(12746, new String[]{"横折提", "㇊", "\u31CA"});
            put(12741, new String[]{"横折折", "㇅", "\u31C5"});
            put(12747, new String[]{"横折折撇", "㇋", "\u31CB"});
            put(12750, new String[]{"横折折折", "㇎", "\u31CE"});
            put(12744, new String[]{"横折弯钩", "㇈", "\u31C8"});
            put(12748, new String[]{"横撇弯钩", "㇌", "\u31CC"});
            put(12769, new String[]{"横折折折钩", "𠄎", "\u31E1"});
            put(12761, new String[]{"竖提", "𠄌", "\u31D9"});
            put(12762, new String[]{"竖钩", "亅", "\u31DA"});
            put(12740, new String[]{"竖弯", "㇄", "\u31C4"});
            put(12759, new String[]{"竖折", "𠃊", "\u31D7"});
            put(12767, new String[]{"竖弯钩", "乚", "\u31DF"});
            put(12579, new String[]{"竖折撇", "ㄣ", "\u3123"});
            put(12766, new String[]{"竖折折", "𠃑", "\u31DE"});
            put(12745, new String[]{"竖折折钩", "㇉", "\u31C9"});
            put(12763, new String[]{"撇点", "𡿨", "\u31DB"});
            put(12764, new String[]{"撇折", "𠃋", "\u31DC"});
            put(12737, new String[]{"弯钩", "㇁", "\u31C1"});
            put(12738, new String[]{"斜钩", "㇂", "\u31C2"});

//            WordDataImportRunner    : not found stroke 竖弯折 in use
//            WordDataImportRunner    : not found stroke 横斜弯钩 in use
//            WordDataImportRunner    : not found stroke 撇钩 in use
//            WordDataImportRunner    : not found stroke 提捺 in use
//            WordDataImportRunner    : not found stroke 卧钩 in use
//            WordDataImportRunner    : not found stroke 竖撇 in use
            put(12760, new String[]{"竖弯折", "\u31D8", "\u31D8"});
            put(12768, new String[]{"横斜弯钩", "乙", "\u31E0"});
            put(12770, new String[]{"撇钩", "\u31E2", "\u31E2"});
            put(12765, new String[]{"提捺", "\u31DD", "\u31DD"});
            put(12739, new String[]{"卧钩", "㇃", "\u31C3"});
            put(12755, new String[]{"竖撇", "\u31D3", "\u31D3"});

        }
    };

    public static Map<String, String[]> STROKE_NAMES = new HashMap<String, String[]>() {
        {
            Iterator<Integer> kcIterator = STROKE_KEYCODES.keySet().iterator();
            while (kcIterator.hasNext()) {
                Integer kc = kcIterator.next();
                String[] kcName = STROKE_KEYCODES.get(kc);
                put(kcName[0], new String[]{String.valueOf(kc),kcName[1],kcName[2]});
            }
        }
    };

    public static String LEVEL1 = "一,乙,二,十,丁,厂,七,卜,八,人,入,儿,匕,几,九,刁,了,刀,力,乃,又,三,干,于,亏,工,土,士,才,下,寸,大,丈,与,万,上,小,口,山,巾,千,乞,川,亿,个,夕,久,么,勺,凡,丸,及,广,亡,门,丫,义,之,尸,己,已,巳,弓,子,卫,也,女,刃,飞,习,叉,马,乡,丰,王,开,井,天,夫,元,无,云,专,丐,扎,艺,木,五,支,厅,不,犬,太,区,历,歹,友,尤,匹,车,巨,牙,屯,戈,比,互,切,瓦,止,少,曰,日,中,贝,冈,内,水,见,午,牛,手,气,毛,壬,升,夭,长,仁,什,片,仆,化,仇,币,仍,仅,斤,爪,反,介,父,从,仑,今,凶,分,乏,公,仓,月,氏,勿,欠,风,丹,匀,乌,勾,凤,六,文,亢,方,火,为,斗,忆,计,订,户,认,冗,讥,心,尺,引,丑,巴,孔,队,办,以,允,予,邓,劝,双,书,幻,玉,刊,未,末,示,击,打,巧,正,扑,卉,扒,功,扔,去,甘,世,艾,古,节,本,术,可,丙,左,厉,石,右,布,夯,戊,龙,平,灭,轧,东,卡,北,占,凸,卢,业,旧,帅,归,旦,目,且,叶,甲,申,叮,电,号,田,由,只,叭,史,央,兄,叽,叼,叫,叩,叨,另,叹,冉,皿,凹,囚,四,生,矢,失,乍,禾,丘,付,仗,代,仙,们,仪,白,仔,他,斥,瓜,乎,丛,令,用,甩,印,尔,乐,句,匆,册,卯,犯,外,处,冬,鸟,务,包,饥,主,市,立,冯,玄,闪,兰,半,汁,汇,头,汉,宁,穴,它,讨,写,让,礼,训,议,必,讯,记,永,司,尼,民,弗,弘,出,辽,奶,奴,召,加,皮,边,孕,发,圣,对,台,矛,纠,母,幼,丝,邦,式,迂,刑,戎,动,扛,寺,吉,扣,考,托,老,巩,圾,执,扩,扫,地,场,扬,耳,芋,共,芒,亚,芝,朽,朴,机,权,过,臣,吏,再,协,西,压,厌,戌,在,百,有,存,而,页,匠,夸,夺,灰,达,列,死,成,夹,夷,轨,邪,尧,划,迈,毕,至,此,贞,师,尘,尖,劣,光,当,早,吁,吐,吓,虫,曲,团,吕,同,吊,吃,因,吸,吗,吆,屿,屹,岁,帆,回,岂,则,刚,网,肉,年,朱,先,丢,廷,舌,竹,迁,乔,迄,伟,传,乒,乓,休,伍,伏,优,臼,伐,延,仲,件,任,伤,价,伦,份,华,仰,仿,伙,伪,自,伊,血,向,似,后,行,舟,全,会,杀,合,兆,企,众,爷,伞,创,肌,肋,朵,杂,危,旬,旨,旭,负,匈,名,各,多,争,色,壮,冲,妆,冰,庄,庆,亦,刘,齐,交,衣,次,产,决,亥,充,妄,闭,问,闯,羊,并,关,米,灯,州,汗,污,江,汛,池,汝,汤,忙,兴,宇,守,宅,字,安,讲,讳,军,讶,许,讹,论,讼,农,讽,设,访,诀,寻,那,迅,尽,导,异,弛,孙,阵,阳,收,阶,阴,防,奸,如,妇,妃,好,她,妈,戏,羽,观,欢,买,红,驮,纤,驯,约,级,纪,驰,纫,巡,寿,弄,麦,玖,玛,形,进,戒,吞,远,违,韧,运,扶,抚,坛,技,坏,抠,扰,扼,拒,找,批,址,扯,走,抄,贡,汞,坝,攻,赤,折,抓,扳,抡,扮,抢,孝,坎,均,抑,抛,投,坟,坑,抗,坊,抖,护,壳,志,块,扭,声,把,报,拟,却,抒,劫,芙,芜,苇,芽,花,芹,芥,芬,苍,芳,严,芦,芯,劳,克,芭,苏,杆,杠,杜,材,村,杖,杏,杉,巫,极,李,杨,求,甫,匣,更,束,吾,豆,两,酉,丽,医,辰,励,否,还,尬,歼,来,连,轩,步,卤,坚,肖,旱,盯,呈,时,吴,助,县,里,呆,吱,吠,呕,园,旷,围,呀,吨,足,邮,男,困,吵,串,员,呐,听,吟,吩,呛,吻,吹,呜,吭,吧,邑,吼,囤,别,吮,岖,岗,帐,财,针,钉,牡,告,我,乱,利,秃,秀,私,每,兵,估,体,何,佐,佑,但,伸,佃,作,伯,伶,佣,低,你,住,位,伴,身,皂,伺,佛,囱,近,彻,役,返,余,希,坐,谷,妥,含,邻,岔,肝,肛,肚,肘,肠,龟,甸,免,狂,犹,狈,角,删,条,彤,卵,灸,岛,刨,迎,饭,饮,系,言,冻,状,亩,况,床,库,庇,疗,吝,应,这,冷,庐,序,辛,弃,冶,忘,闰,闲,间,闷,判,兑,灶,灿,灼,弟,汪,沐,沛,汰,沥,沙,汽,沃,沦,汹,泛,沧,没,沟,沪,沈,沉,沁,怀,忧,忱,快,完,宋,宏,牢,究,穷,灾,良,证,启,评,补,初,社,祀,识,诈,诉,罕,诊,词,译,君,灵,即,层,屁,尿,尾,迟,局,改,张,忌,际,陆,阿,陈,阻,附,坠,妓,妙,妖,姊,妨,妒,努,忍,劲,矣,鸡,纬,驱,纯,纱,纲,纳,驳,纵,纷,纸,纹,纺,驴,纽,奉,玩,环,武,青,责,现,玫,表,规,抹,卦,坷,坯,拓,拢,拔,坪,拣,坦,担,坤,押,抽,拐,拖,者,拍,顶,拆,拎,拥,抵,拘,势,抱,拄,垃,拉,拦,幸,拌,拧,拂,拙,招,坡,披,拨,择,抬,拇,拗,其,取,茉,苦,昔,苛,若,茂,苹,苗,英,苟,苑,苞,范,直,茁,茄,茎,苔,茅,枉,林,枝,杯,枢,柜,枚,析,板,松,枪,枫,构,杭,杰,述,枕,丧,或,画,卧,事,刺,枣,雨,卖,郁,矾,矿,码,厕,奈,奔,奇,奋,态,欧,殴,垄,妻,轰,顷,转,斩,轮,软,到,非,叔,歧,肯,齿,些,卓,虎,虏,肾,贤,尚,旺,具,味,果,昆,国,哎,咕,昌,呵,畅,明,易,咙,昂,迪,典,固,忠,呻,咒,咋,咐,呼,鸣,咏,呢,咄,咖,岸,岩,帖,罗,帜,帕,岭,凯,败,账,贩,贬,购,贮,图,钓,制,知,迭,氛,垂,牧,物,乖,刮,秆,和,季,委,秉,佳,侍,岳,供,使,例,侠,侥,版,侄,侦,侣,侧,凭,侨,佩,货,侈,依,卑,的,迫,质,欣,征,往,爬,彼,径,所,舍,金,刹,命,肴,斧,爸,采,觅,受,乳,贪,念,贫,忿,肤,肺,肢,肿,胀,朋,股,肮,肪,肥,服,胁,周,昏,鱼,兔,狐,忽,狗,狞,备,饰,饱,饲,变,京,享,庞,店,夜,庙,府,底,疟,疙,疚,剂,卒,郊,庚,废,净,盲,放,刻,育,氓,闸,闹,郑,券,卷,单,炬,炒,炊,炕,炎,炉,沫,浅,法,泄,沽,河,沾,泪,沮,油,泊,沿,泡,注,泣,泞,泻,泌,泳,泥,沸,沼,波,泼,泽,治,怔,怯,怖,性,怕,怜,怪,怡,学,宝,宗,定,宠,宜,审,宙,官,空,帘,宛,实,试,郎,诗,肩,房,诚,衬,衫,视,祈,话,诞,诡,询,该,详,建,肃,录,隶,帚,屉,居,届,刷,屈,弧,弥,弦,承,孟,陋,陌,孤,陕,降,函,限,妹,姑,姐,姓,妮,始,姆,迢,驾,叁,参,艰,线,练,组,绅,细,驶,织,驹,终,驻,绊,驼,绍,绎,经,贯,契,贰,奏,春,帮,玷,珍,玲,珊,玻,毒,型,拭,挂,封,持,拷,拱,项,垮,挎,城,挟,挠,政,赴,赵,挡,拽,哉,挺,括,垢,拴,拾,挑,垛,指,垫,挣,挤,拼,挖,按,挥,挪,拯,某,甚,荆,茸,革,茬,荐,巷,带,草,茧,茵,茶,荒,茫,荡,荣,荤,荧,故,胡,荫,荔,南,药,标,栈,柑,枯,柄,栋,相,查,柏,栅,柳,柱,柿,栏,柠,树,勃,要,柬,咸,威,歪,研,砖,厘,厚,砌,砂,泵,砚,砍,面,耐,耍,牵,鸥,残,殃,轴,轻,鸦,皆,韭,背,战,点,虐,临,览,竖,省,削,尝,昧,盹,是,盼,眨,哇,哄,哑,显,冒,映,星,昨,咧,昭,畏,趴,胃,贵,界,虹,虾,蚁,思,蚂,虽,品,咽,骂,勋,哗,咱,响,哈,哆,咬,咳,咪,哪,哟,炭,峡,罚,贱,贴,贻,骨,幽,钙,钝,钞,钟,钢,钠,钥,钦,钧,钩,钮,卸,缸,拜,看,矩,毡,氢,怎,牲,选,适,秒,香,种,秋,科,重,复,竿,段,便,俩,贷,顺,修,俏,保,促,俄,俐,侮,俭,俗,俘,信,皇,泉,鬼,侵,禹,侯,追,俊,盾,待,徊,衍,律,很,须,叙,剑,逃,食,盆,胚,胧,胆,胜,胞,胖,脉,胎,勉,狭,狮,独,狰,狡,狱,狠,贸,怨,急,饵,饶,蚀,饺,饼,峦,弯,将,奖,哀,亭,亮,度,迹,庭,疮,疯,疫,疤,咨,姿,亲,音,帝,施,闺,闻,闽,阀,阁,差,养,美,姜,叛,送,类,迷,籽,娄,前,首,逆,兹,总,炼,炸,烁,炮,炫,烂,剃,洼,洁,洪,洒,柒,浇,浊,洞,测,洗,活,派,洽,染,洛,浏,济,洋,洲,浑,浓,津,恃,恒,恢,恍,恬,恤,恰,恼,恨,举,觉,宣,宦,室,宫,宪,突,穿,窃,客,诫,冠,诬,语,扁,袄,祖,神,祝,祠,误,诱,诲,说,诵,垦,退,既,屋,昼,屏,屎,费,陡,逊,眉,孩,陨,除,险,院,娃,姥,姨,姻,娇,姚,娜,怒,架,贺,盈,勇,怠,癸,蚤,柔,垒,绑,绒,结,绕,骄,绘,给,绚,骆,络,绝,绞,骇,统,耕,耘,耗,耙,艳,泰,秦,珠,班,素,匿,蚕,顽,盏,匪,捞,栽,捕,埂,捂,振,载,赶,起,盐,捎,捍,捏,埋,捉,捆,捐,损,袁,捌,都,哲,逝,捡,挫,换,挽,挚,热,恐,捣,壶,捅,埃,挨,耻,耿,耽,聂,恭,莽,莱,莲,莫,莉,荷,获,晋,恶,莹,莺,真,框,梆,桂,桔,栖,档,桐,株,桥,桦,栓,桃,格,桩,校,核,样,根,索,哥,速,逗,栗,贾,酌,配,翅,辱,唇,夏,砸,砰,砾,础,破,原,套,逐,烈,殊,殉,顾,轿,较,顿,毙,致,柴,桌,虑,监,紧,党,逞,晒,眠,晓,哮,唠,鸭,晃,哺,晌,剔,晕,蚌,畔,蚣,蚊,蚪,蚓,哨,哩,圃,哭,哦,恩,鸯,唤,唁,哼,唧,啊,唉,唆,罢,峭,峨,峰,圆,峻,贼,贿,赂,赃,钱,钳,钻,钾,铁,铃,铅,缺,氧,氨,特,牺,造,乘,敌,秤,租,积,秧,秩,称,秘,透,笔,笑,笋,债,借,值,倚,俺,倾,倒,倘,俱,倡,候,赁,俯,倍,倦,健,臭,射,躬,息,倔,徒,徐,殷,舰,舱,般,航,途,拿,耸,爹,舀,爱,豺,豹,颁,颂,翁,胰,脆,脂,胸,胳,脏,脐,胶,脑,脓,逛,狸,狼,卿,逢,鸵,留,鸳,皱,饿,馁,凌,凄,恋,桨,浆,衰,衷,高,郭,席,准,座,症,病,疾,斋,疹,疼,疲,脊,效,离,紊,唐,瓷,资,凉,站,剖,竞,部,旁,旅,畜,阅,羞,羔,瓶,拳,粉,料,益,兼,烤,烘,烦,烧,烛,烟,烙,递,涛,浙,涝,浦,酒,涉,消,涡,浩,海,涂,浴,浮,涣,涤,流,润,涧,涕,浪,浸,涨,烫,涩,涌,悖,悟,悄,悍,悔,悯,悦,害,宽,家,宵,宴,宾,窍,窄,容,宰,案,请,朗,诸,诺,读,扇,诽,袜,袖,袍,被,祥,课,冥,谁,调,冤,谅,谆,谈,谊,剥,恳,展,剧,屑,弱,陵,祟,陶,陷,陪,娱,娟,恕,娥,娘,通,能,难,预,桑,绢,绣,验,继,骏,球,琐,理,琉,琅,捧,堵,措,描,域,捺,掩,捷,排,焉,掉,捶,赦,堆,推,埠,掀,授,捻,教,掏,掐,掠,掂,培,接,掷,控,探,据,掘,掺,职,基,聆,勘,聊,娶,著,菱,勒,黄,菲,萌,萝,菌,萎,菜,萄,菊,菩,萍,菠,萤,营,乾,萧,萨,菇,械,彬,梦,婪,梗,梧,梢,梅,检,梳,梯,桶,梭,救,曹,副,票,酝,酗,厢,戚,硅,硕,奢,盔,爽,聋,袭,盛,匾,雪,辅,辆,颅,虚,彪,雀,堂,常,眶,匙,晨,睁,眯,眼,悬,野,啪,啦,曼,晦,晚,啄,啡,距,趾,啃,跃,略,蚯,蛀,蛇,唬,累,鄂,唱,患,啰,唾,唯,啤,啥,啸,崖,崎,崭,逻,崔,帷,崩,崇,崛,婴,圈,铐,铛,铝,铜,铭,铲,银,矫,甜,秸,梨,犁,秽,移,笨,笼,笛,笙,符,第,敏,做,袋,悠,偿,偶,偎,偷,您,售,停,偏,躯,兜,假,衅,徘,徙,得,衔,盘,舶,船,舵,斜,盒,鸽,敛,悉,欲,彩,领,脚,脖,脯,豚,脸,脱,象,够,逸,猜,猪,猎,猫,凰,猖,猛,祭,馅,馆,凑,减,毫,烹,庶,麻,庵,痊,痒,痕,廊,康,庸,鹿,盗,章,竟,商,族,旋,望,率,阎,阐,着,羚,盖,眷,粘,粗,粒,断,剪,兽,焊,焕,清,添,鸿,淋,涯,淹,渠,渐,淑,淌,混,淮,淆,渊,淫,渔,淘,淳,液,淤,淡,淀,深,涮,涵,婆,梁,渗,情,惜,惭,悼,惧,惕,惟,惊,惦,悴,惋,惨,惯,寇,寅,寄,寂,宿,窒,窑,密,谋,谍,谎,谐,袱,祷,祸,谓,谚,谜,逮,敢,尉,屠,弹,隋,堕,随,蛋,隅,隆,隐,婚,婶,婉,颇,颈,绩,绪,续,骑,绰,绳,维,绵,绷,绸,综,绽,绿,缀,巢,琴,琳,琢,琼,斑,替,揍,款,堪,塔,搭,堰,揩,越,趁,趋,超,揽,堤,提,博,揭,喜,彭,揣,插,揪,搜,煮,援,搀,裁,搁,搓,搂,搅,壹,握,搔,揉,斯,期,欺,联,葫,散,惹,葬,募,葛,董,葡,敬,葱,蒋,蒂,落,韩,朝,辜,葵,棒,棱,棋,椰,植,森,焚,椅,椒,棵,棍,椎,棉,棚,棕,棺,榔,椭,惠,惑,逼,粟,棘,酣,酥,厨,厦,硬,硝,确,硫,雁,殖,裂,雄,颊,雳,暂,雅,翘,辈,悲,紫,凿,辉,敞,棠,赏,掌,晴,睐,暑,最,晰,量,鼎,喷,喳,晶,喇,遇,喊,遏,晾,景,畴,践,跋,跌,跑,跛,遗,蛙,蛛,蜓,蜒,蛤,喝,鹃,喂,喘,喉,喻,啼,喧,嵌,幅,帽,赋,赌,赎,赐,赔,黑,铸,铺,链,销,锁,锄,锅,锈,锋,锌,锐,甥,掰,短,智,氮,毯,氯,鹅,剩,稍,程,稀,税,筐,等,筑,策,筛,筒,筏,答,筋,筝,傲,傅,牌,堡,集,焦,傍,储,皓,皖,粤,奥,街,惩,御,循,艇,舒,逾,番,释,禽,腊,脾,腋,腔,腕,鲁,猩,猬,猾,猴,惫,然,馈,馋,装,蛮,就,敦,斌,痘,痢,痪,痛,童,竣,阔,善,翔,羡,普,粪,尊,奠,道,遂,曾,焰,港,滞,湖,湘,渣,渤,渺,湿,温,渴,溃,溅,滑,湃,渝,湾,渡,游,滋,渲,溉,愤,慌,惰,愕,愣,惶,愧,愉,慨,割,寒,富,寓,窜,窝,窖,窗,窘,遍,雇,裕,裤,裙,禅,禄,谢,谣,谤,谦,犀,属,屡,强,粥,疏,隔,隙,隘,媒,絮,嫂,媚,婿,登,缅,缆,缉,缎,缓,缔,缕,骗,编,骚,缘,瑟,鹉,瑞,瑰,瑙,魂,肆,摄,摸,填,搏,塌,鼓,摆,携,搬,摇,搞,塘,摊,聘,斟,蒜,勤,靴,靶,鹊,蓝,墓,幕,蓬,蓄,蒲,蓉,蒙,蒸,献,椿,禁,楚,楷,榄,想,槐,榆,楼,概,赖,酪,酬,感,碍,碘,碑,碎,碰,碗,碌,尴,雷,零,雾,雹,辐,辑,输,督,频,龄,鉴,睛,睹,睦,瞄,睫,睡,睬,嗜,鄙,嗦,愚,暖,盟,歇,暗,暇,照,畸,跨,跷,跳,跺,跪,路,跤,跟,遣,蜈,蜗,蛾,蜂,蜕,嗅,嗡,嗓,署,置,罪,罩,蜀,幌,错,锚,锡,锣,锤,锥,锦,键,锯,锰,矮,辞,稚,稠,颓,愁,筹,签,简,筷,毁,舅,鼠,催,傻,像,躲,魁,衙,微,愈,遥,腻,腰,腥,腮,腹,腺,鹏,腾,腿,鲍,猿,颖,触,解,煞,雏,馍,馏,酱,禀,痹,廓,痴,痰,廉,靖,新,韵,意,誊,粮,数,煎,塑,慈,煤,煌,满,漠,滇,源,滤,滥,滔,溪,溜,漓,滚,溢,溯,滨,溶,溺,粱,滩,慎,誉,塞,寞,窥,窟,寝,谨,褂,裸,福,谬,群,殿,辟,障,媳,嫉,嫌,嫁,叠,缚,缝,缠,缤,剿,静,碧,璃,赘,熬,墙,墟,嘉,摧,赫,截,誓,境,摘,摔,撇,聚,慕,暮,摹,蔓,蔑,蔡,蔗,蔽,蔼,熙,蔚,兢,模,槛,榴,榜,榨,榕,歌,遭,酵,酷,酿,酸,碟,碱,碳,磁,愿,需,辖,辗,雌,裳,颗,瞅,墅,嗽,踊,蜻,蜡,蝇,蜘,蝉,嘛,嘀,赚,锹,锻,镀,舞,舔,稳,熏,箕,算,箩,管,箫,舆,僚,僧,鼻,魄,魅,貌,膜,膊,膀,鲜,疑,孵,馒,裹,敲,豪,膏,遮,腐,瘩,瘟,瘦,辣,彰,竭,端,旗,精,粹,歉,弊,熄,熔,煽,潇,漆,漱,漂,漫,滴,漾,演,漏,慢,慷,寨,赛,寡,察,蜜,寥,谭,肇,褐,褪,谱,隧,嫩,翠,熊,凳,骡,缩,慧,撵,撕,撒,撩,趣,趟,撑,撮,撬,播,擒,墩,撞,撤,增,撰,聪,鞋,鞍,蕉,蕊,蔬,蕴,横,槽,樱,橡,樟,橄,敷,豌,飘,醋,醇,醉,磕,磊,磅,碾,震,霄,霉,瞒,题,暴,瞎,嘻,嘶,嘲,嘹,影,踢,踏,踩,踪,蝶,蝴,蝠,蝎,蝌,蝗,蝙,嘿,嘱,幢,墨,镇,镐,镑,靠,稽,稻,黎,稿,稼,箱,篓,箭,篇,僵,躺,僻,德,艘,膝,膛,鲤,鲫,熟,摩,褒,瘪,瘤,瘫,凛,颜,毅,糊,遵,憋,潜,澎,潮,潭,鲨,澳,潘,澈,澜,澄,懂,憔,懊,憎,额,翩,褥,谴,鹤,憨,慰,劈,履,豫,缭,撼,擂,操,擅,燕,蕾,薯,薛,薇,擎,薪,薄,颠,翰,噩,橱,橙,橘,整,融,瓢,醒,霍,霎,辙,冀,餐,嘴,踱,蹄,蹂,蟆,螃,器,噪,鹦,赠,默,黔,镜,赞,穆,篮,篡,篷,篱,儒,邀,衡,膨,雕,鲸,磨,瘾,瘸,凝,辨,辩,糙,糖,糕,燃,濒,澡,激,懒,憾,懈,窿,壁,避,缰,缴,戴,擦,藉,鞠,藏,藐,檬,檐,檀,礁,磷,霜,霞,瞭,瞧,瞬,瞳,瞩,瞪,曙,蹋,蹈,螺,蟋,蟀,嚎,赡,穗,魏,簧,簇,繁,徽,爵,朦,臊,鳄,癌,辫,赢,糟,糠,燥,懦,豁,臀,臂,翼,骤,藕,鞭,藤,覆,瞻,蹦,嚣,镰,翻,鳍,鹰,瀑,襟,璧,戳,孽,警,蘑,藻,攀,曝,蹲,蹭,蹬,巅,簸,簿,蟹,颤,靡,癣,瓣,羹,鳖,爆,疆,鬓,壤,馨,耀,躁,蠕,嚼,嚷,巍,籍,鳞,魔,糯,灌,譬,蠢,霸,露,霹,躏,黯,髓,赣,囊,镶,瓤,罐,矗";

    public static String LEVEL2 = "乂,乜,兀,弋,孑,孓,幺,亓,韦,廿,丏,卅,仄,厄,仃,仉,仂,兮,刈,爻,卞,闩,讣,尹,夬,爿,毋,邗,邛,艽,艿,札,叵,匝,丕,匜,劢,卟,叱,叻,仨,仕,仟,仡,仫,仞,卮,氐,犰,刍,邝,邙,汀,讦,讧,讪,讫,尻,阡,尕,弁,驭,匡,耒,玎,玑,邢,圩,圬,圭,扦,圪,圳,圹,扪,圮,圯,芊,芍,芄,芨,芑,芎,芗,亘,厍,夼,戍,尥,乩,旯,曳,岌,屺,凼,囡,钇,缶,氘,氖,牝,伎,伛,伢,佤,仵,伥,伧,伉,伫,囟,汆,刖,夙,旮,刎,犷,犸,舛,凫,邬,饧,汕,汔,汐,汲,汜,汊,忖,忏,讴,讵,祁,讷,聿,艮,厾,阱,阮,阪,丞,妁,牟,纡,纣,纥,纨,玕,玙,抟,抔,圻,坂,坍,坞,抃,抉,㧐,芫,邯,芸,芾,苈,苣,芷,芮,苋,芼,苌,苁,芩,芪,芡,芟,苄,苎,苡,杌,杓,杞,杈,忑,孛,邴,邳,矶,奁,豕,忒,欤,轫,迓,邶,忐,卣,邺,旰,呋,呒,呓,呔,呖,呃,旸,吡,町,虬,呗,吽,吣,吲,帏,岐,岈,岘,岑,岚,兕,囵,囫,钊,钋,钌,迕,氙,氚,牤,佞,邱,攸,佚,佝,佟,佗,伽,彷,佘,佥,孚,豸,坌,肟,邸,奂,劬,狄,狁,鸠,邹,饨,饩,饪,饫,饬,亨,庑,庋,疔,疖,肓,闱,闳,闵,羌,炀,沣,沅,沔,沤,沌,沏,沚,汩,汨,沂,汾,沨,汴,汶,沆,沩,泐,怃,怄,忡,忤,忾,怅,忻,忪,怆,忭,忸,诂,诃,诅,诋,诌,诏,诒,孜,陇,陀,陂,陉,妍,妩,妪,妣,妊,妗,妫,妞,姒,妤,邵,劭,刭,甬,邰,纭,纰,纴,纶,纾,玮,玡,玭,玠,玢,玥,玦,盂,忝,匦,坩,抨,拤,坫,拈,垆,抻,劼,拃,拊,坼,坻,㧟,坨,坭,抿,坳,耶,苷,苯,苤,茏,苫,苜,苴,苒,苘,茌,苻,苓,茚,茆,茑,茓,茔,茕,茀,苕,枥,枇,杪,杳,枧,杵,枨,枞,枋,杻,杷,杼,矸,砀,刳,奄,瓯,殁,郏,轭,郅,鸢,盱,昊,昙,杲,昃,咂,呸,昕,昀,旻,昉,炅,咔,畀,虮,咀,呷,黾,呱,呤,咚,咆,咛,呶,呣,呦,咝,岢,岿,岬,岫,帙,岣,峁,刿,迥,岷,剀,帔,峄,沓,囹,罔,钍,钎,钏,钒,钕,钗,邾,迮,牦,竺,迤,佶,佬,佰,侑,侉,臾,岱,侗,侃,侏,侩,佻,佾,侪,佼,佯,侬,帛,阜,侔,徂,刽,郄,怂,籴,瓮,戗,肼,䏝,肽,肱,肫,剁,迩,郇,狙,狎,狍,狒,咎,炙,枭,饯,饴,冽,冼,庖,疠,疝,疡,兖,妾,劾,炜,熰,炖,炘,炝,炔,泔,沭,泷,泸,泱,泅,泗,泠,泺,泖,泫,泮,沱,泯,泓,泾,怙,怵,怦,怛,怏,怍,㤘,怩,怫,怿,宕,穹,宓,诓,诔,诖,诘,戾,诙,戽,郓,衩,祆,祎,祉,祇,诛,诜,诟,诠,诣,诤,诧,诨,诩,戕,孢,亟,陔,妲,妯,姗,帑,弩,孥,驽,虱,迦,迨,绀,绁,绂,驷,驸,绉,绌,驿,骀,甾,珏,珐,珂,珑,玳,珀,顸,珉,珈,拮,垭,挝,垣,挞,垤,赳,贲,垱,垌,郝,垧,垓,挦,垠,茜,荚,荑,贳,荜,莒,茼,茴,茱,莛,荞,茯,荏,荇,荃,荟,荀,茗,荠,茭,茨,垩,荥,荦,荨,荩,剋,荪,茹,荬,荮,柰,栉,柯,柘,栊,柩,枰,栌,柙,枵,柚,枳,柞,柝,栀,柢,栎,枸,柈,柁,枷,柽,剌,酊,郦,甭,砗,砘,砒,斫,砭,砜,奎,耷,虺,殂,殇,殄,殆,轱,轲,轳,轶,轸,虿,毖,觇,尜,哐,眄,眍,\uD843\uDCD0,郢,眇,眊,眈,禺,哂,咴,曷,昴,昱,昵,咦,哓,哔,畎,毗,呲,胄,畋,畈,虼,虻,盅,咣,哕,剐,郧,咻,囿,咿,哌,哙,哚,咯,咩,咤,哝,哏,哞,峙,峣,罘,帧,峒,峤,峋,峥,贶,钚,钛,钡,钣,钤,钨,钫,钯,氡,氟,牯,郜,秕,秭,竽,笈,笃,俦,俨,俅,俪,叟,垡,牮,俣,俚,皈,俑,俟,逅,徇,徉,舢,俞,郗,俎,郤,爰,郛,瓴,胨,胪,胛,胂,胙,胍,胗,胝,朐,胫,鸨,匍,狨,狯,飑,狩,狲,訇,逄,昝,饷,饸,饹,胤,孪,娈,弈,奕,庥,疬,疣,疥,疭,庠,竑,彦,飒,闼,闾,闿,阂,羑,迸,籼,酋,炳,炻,炽,炯,烀,炷,烃,洱,洹,洧,洌,浃,洇,洄,洙,涎,洎,洫,浍,洮,洵,浒,浔,浕,洳,恸,恓,恹,恫,恺,恻,恂,恪,恽,宥,扃,衲,衽,衿,袂,祛,祜,祓,祚,诮,祗,祢,诰,诳,鸩,昶,郡,咫,弭,牁,胥,陛,陟,娅,姮,娆,姝,姣,姘,姹,怼,羿,炱,矜,绔,骁,骅,绗,绛,骈,耖,挈,珥,珙,顼,珰,珩,珧,珣,珞,琤,珲,敖,恚,埔,埕,埘,埙,埚,挹,耆,耄,埒,捋,贽,垸,捃,盍,荸,莆,莳,莴,莪,莠,莓,莜,莅,荼,莩,荽,莸,荻,莘,莎,莞,莨,鸪,莼,栲,栳,郴,桓,桡,桎,桢,桤,梃,栝,桕,桁,桧,桅,栟,桉,栩,逑,逋,彧,鬲,豇,酐,逦,厝,孬,砝,砹,砺,砧,砷,砟,砼,砥,砣,剞,砻,轼,轾,辂,鸫,趸,龀,鸬,虔,逍,眬,唛,晟,眩,眙,哧,哽,唔,晁,晏,鸮,趵,趿,畛,蚨,蚜,蚍,蚋,蚬,蚝,蚧,唢,圄,唣,唏,盎,唑,崂,崃,罡,罟,峪,觊,赅,钰,钲,钴,钵,钹,钺,钽,钼,钿,铀,铂,铄,铆,铈,铉,铊,铋,铌,铍,䥽,铎,氩,氤,氦,毪,舐,秣,秫,盉,笄,笕,笊,笏,笆,俸,倩,俵,偌,俳,俶,倬,倏,恁,倭,倪,俾,倜,隼,隽,倌,倥,臬,皋,郫,倨,衄,颀,徕,舫,釜,奚,衾,胯,胱,胴,胭,脍,胼,朕,脒,胺,鸱,玺,鸲,狷,猁,狳,猃,狺,逖,桀,袅,饽,凇,栾,挛,亳,疳,疴,疸,疽,痈,疱,痂,痉,衮,凋,颃,恣,旆,旄,旃,阃,阄,訚,阆,恙,粑,朔,郸,烜,烨,烩,烊,剡,郯,烬,涑,浯,涞,涟,娑,涅,涠,浞,涓,浥,涔,浜,浠,浣,浚,悚,悭,悝,悒,悌,悛,宸,窈,剜,诹,冢,诼,袒,袢,祯,诿,谀,谂,谄,谇,屐,屙,陬,勐,奘,牂,蚩,陲,姬,娠,娌,娉,娲,娩,娴,娣,娓,婀,畚,逡,绠,骊,绡,骋,绥,绦,绨,骎,邕,鸶,彗,耜,焘,舂,琏,琇,麸,揶,埴,埯,捯,掳,掴,埸,埵,赧,埤,捭,逵,埝,堋,堍,掬,鸷,掖,捽,掊,堉,掸,捩,掮,悫,埭,埽,掇,掼,聃,菁,萁,菘,堇,萘,萋,菽,菖,萜,萸,萑,棻,菔,菟,萏,萃,菏,菹,菪,菅,菀,萦,菰,菡,梵,梿,梏,觋,桴,桷,梓,棁,桫,棂,啬,郾,匮,敕,豉,鄄,酞,酚,戛,硎,硭,硒,硖,硗,硐,硇,硌,鸸,瓠,匏,厩,龚,殒,殓,殍,赉,雩,辄,堑,眭,眦,啧,晡,晤,眺,眵,眸,圊,喏,喵,啉,勖,晞,唵,晗,冕,啭,畦,趺,啮,跄,蚶,蛄,蛎,蛆,蚰,蛊,圉,蚱,蛉,蛏,蚴,啁,啕,唿,啐,唼,唷,啖,啵,啶,啷,唳,唰,啜,帻,崚,崦,帼,崮,崤,崆,赇,赈,赊,铑,铒,铗,铙,铟,铠,铡,铢,铣,铤,铧,铨,铩,铪,铫,铬,铮,铯,铰,铱,铳,铵,铷,氪,牾,鸹,秾,逶,笺,筇,笸,笪,笮,笠,笥,笤,笳,笾,笞,偾,偃,偕,偈,傀,偬,偻,皑,皎,鸻,徜,舸,舻,舴,舷,龛,翎,脬,脘,脲,匐,猗,猡,猞,猝,斛,猕,馗,馃,馄,鸾,孰,庹,庾,痔,痍,疵,翊,旌,旎,袤,阇,阈,阉,阊,阋,阍,阏,羟,粝,粕,敝,焐,烯,焓,烽,焖,烷,焗,渍,渚,淇,淅,淞,渎,涿,淖,挲,淠,涸,渑,淦,淝,淬,涪,淙,涫,渌,淄,惬,悻,悱,惝,惘,悸,惆,惚,惇,惮,窕,谌,谏,扈,皲,谑,裆,袷,裉,谒,谔,谕,谖,谗,谙,谛,谝,逯,郿,隈,粜,隍,隗,婧,婊,婕,娼,婢,婵,胬,袈,翌,恿,欸,绫,骐,绮,绯,绱,骒,绲,骓,绶,绺,绻,绾,骖,缁,耠,琫,琵,琶,琪,瑛,琦,琥,琨,靓,琰,琮,琯,琬,琛,琚,辇,鼋,揳,堞,搽,揸,揠,堙,趄,揖,颉,塄,揿,耋,揄,蛩,蛰,塆,摒,揆,掾,聒,葑,葚,靰,靸,葳,葺,葸,萼,葆,葩,葶,蒌,萱,戟,葭,楮,棼,椟,棹,椤,棰,赍,椋,椁,椪,棣,椐,鹁,覃,酤,酢,酡,鹂,厥,殚,殛,雯,雱,辊,辋,椠,辍,辎,斐,睄,睑,睇,睃,戢,喋,嗒,喃,喱,喹,晷,喈,跖,跗,跞,跚,跎,跏,跆,蛱,蛲,蛭,蛳,蛐,蛔,蛞,蛴,蛟,蛘,喁,喟,啾,嗖,喑,嗟,喽,嗞,喀,喔,喙,嵘,嵖,崴,遄,詈,嵎,崽,嵬,嵛,嵯,嵝,嵫,幄,嵋,赕,铻,铼,铿,锃,锂,锆,锇,锉,锏,锑,锒,锔,锕,掣,矬,氰,毳,毽,犊,犄,犋,鹄,犍,嵇,黍,稃,稂,筚,筵,筌,傣,傈,舄,牍,傥,傧,遑,傩,遁,徨,媭,畲,弑,颌,翕,釉,鹆,舜,貂,腈,腌,腓,腆,腴,腑,腚,腱,鱿,鲀,鲂,颍,猢,猹,猥,飓,觞,觚,猱,颎,飧,馇,馊,亵,脔,裒,痣,痨,痦,痞,痤,痫,痧,赓,竦,瓿,啻,颏,鹇,阑,阒,阕,粞,遒,孳,焯,焜,焙,焱,鹈,湛,渫,湮,湎,湜,渭,湍,湫,溲,湟,溆,湲,湔,湉,渥,湄,滁,愠,惺,愦,惴,愀,愎,愔,喾,寐,谟,扉,裢,裎,裥,祾,祺,谠,幂,谡,谥,谧,遐,孱,弼,巽,骘,媪,媛,婷,巯,翚,皴,婺,骛,缂,缃,缄,彘,缇,缈,缌,缑,缒,缗,飨,耢,瑚,瑁,瑜,瑗,瑄,瑕,遨,骜,韫,髡,塬,鄢,趔,趑,摅,摁,蜇,搋,搪,搐,搛,搠,摈,彀,毂,搦,搡,蓁,戡,蓍,鄞,靳,蓐,蓦,鹋,蒽,蓓,蓖,蓊,蒯,蓟,蓑,蒿,蒺,蓠,蒟,蒡,蒹,蒴,蒗,蓥,颐,楔,楠,楂,楝,楫,楸,椴,槌,楯,皙,榈,槎,榉,楦,楣,楹,椽,裘,剽,甄,酮,酰,酯,酩,蜃,碛,碓,硼,碉,碚,碇,碜,鹌,辏,龃,龅,訾,粲,虞,睚,嗪,韪,嗷,嗉,睨,睢,雎,睥,嘟,嗑,嗫,嗬,嗔,嗝,戥,嗄,煦,暄,遢,暌,跬,跶,跸,跐,跣,跹,跻,蛸,蜊,蜍,蜉,蜣,畹,蛹,嗣,嗯,嗥,嗲,嗳,嗌,嗍,嗨,嗐,嗤,嗵,罨,嵊,嵩,嵴,骰,锗,锛,锜,锝,锞,锟,锢,锨,锩,锭,锱,雉,氲,犏,歃,稞,稗,稔,筠,筢,筮,筲,筱,牒,煲,敫,徭,愆,艄,觎,毹,貊,貅,貉,颔,腠,腩,腼,腭,腧,塍,媵,詹,鲅,鲆,鲇,鲈,稣,鲋,鲐,肄,鹐,飕,觥,遛,馐,鹑,亶,瘃,痱,痼,痿,瘐,瘁,瘆,麂,裔,歆,旒,雍,阖,阗,阙,羧,豢,粳,猷,煳,煜,煨,煅,煊,煸,煺,滟,溱,溘,漭,滢,溥,溧,溽,裟,溻,溷,滗,滫,溴,滏,滃,滦,溏,滂,滓,溟,滪,愫,慑,慊,鲎,骞,窦,窠,窣,裱,褚,裨,裾,裰,禊,谩,谪,媾,嫫,媲,嫒,嫔,媸,缙,缜,缛,辔,骝,缟,缡,缢,缣,骟,耥,璈,瑶,瑭,獒,觏,慝,嫠,韬,叆,髦,摽,墁,撂,摞,撄,翥,踅,摭,墉,墒,榖,綦,蔫,蔷,靺,靼,鞅,靿,甍,蔸,蔟,蔺,戬,蕖,蔻,蓿,斡,鹕,蓼,榛,榧,榻,榫,榭,槔,榱,槁,槟,槠,榷,僰,酽,酶,酹,厮,碡,碴,碣,碲,磋,臧,豨,殡,霆,霁,辕,蜚,裴,翡,龇,龈,睿,䁖,睽,嘞,嘈,嘌,嘁,嘎,暧,暝,踌,踉,蜞,蜥,蜮,蝈,蜴,蜱,蜩,蜷,蜿,螂,蜢,嘘,嘡,鹗,嘣,嘤,嘚,嗾,嘧,罴,罱,幔,嶂,幛,赙,罂,骷,骶,鹘,锲,锴,锶,锷,锸,锵,镁,镂,犒,箐,箦,箧,箍,箸,箬,箅,箪,箔,箜,箢,箓,毓,僖,儆,僳,僭,劁,僮,魃,魆,睾,艋,鄱,膈,膑,鲑,鲔,鲚,鲛,鲟,獐,觫,雒,夤,馑,銮,塾,麽,瘌,瘊,瘘,瘙,廖,韶,旖,膂,阚,鄯,鲞,粿,粼,粽,糁,槊,鹚,熘,熥,潢,漕,滹,漯,漶,潋,潴,漪,漉,漳,漩,澉,潍,慵,搴,窨,寤,綮,谮,褡,褙,褓,褛,褊,谯,谰,谲,暨,屣,鹛,嫣,嫱,嫖,嫦,嫚,嫘,嫡,鼐,翟,瞀,鹜,骠,缥,缦,缧,缨,骢,缪,缫,耦,耧,瑾,璜,璀,璎,璁,璋,璇,奭,髯,髫,撷,撅,赭,撸,鋆,撙,撺,墀,聩,觐,鞑,蕙,鞒,蕈,蕨,蕤,蕞,蕺,瞢,蕃,蕲,赜,槿,樯,槭,樗,樘,樊,槲,醌,醅,靥,魇,餍,磔,磙,霈,辘,龉,龊,觑,瞌,瞋,瞑,嘭,噎,噶,颙,暹,噘,踔,踝,踟,踒,踬,踮,踯,踺,踞,蝽,蝾,蝻,蝰,蝮,螋,蝓,蝣,蝼,噗,嘬,颚,噍,噢,噙,噜,噌,噔,颛,幞,幡,嶙,嶝,骺,骼,骸,镊,镉,镌,镍,镏,镒,镓,镔,稷,箴,篑,篁,篌,篆,牖,儋,徵,磐,虢,鹞,膘,滕,鲠,鲡,鲢,鲣,鲥,鲧,鲩,獗,獠,觯,馓,馔,麾,廛,瘛,瘼,瘢,瘠,齑,羯,羰,\uD857\uDED7,遴,糌,糍,糅,熜,熵,熠,澍,澌,潸,潦,潲,鋈,潟,潼,潺,憬,憧,寮,窳,谳,褴,褟,褫,谵,熨,屦,嬉,勰,戮,蝥,缬,缮,缯,骣,畿,耩,耨,耪,璞,璟,靛,璠,璘,聱,螯,髻,髭,髹,擀,熹,甏,擞,縠,磬,颞,蕻,鞘,颟,薤,薨,檠,薏,薮,薜,薅,樾,橛,橇,樵,檎,橹,樽,樨,橼,墼,橐,翮,醛,醐,醍,醚,磲,赝,飙,殪,霖,霏,霓,錾,辚,臻,遽,氅,瞟,瞠,瞰,嚄,嚆,噤,暾,蹀,踹,踵,踽,蹉,蹁,螨,蟒,螈,螅,螭,螠,螟,噱,噬,噫,噻,噼,罹,圜,䦃,镖,镗,镘,镚,镛,镝,镞,镠,氇,氆,憩,穑,篝,篥,篦,篪,篙,盥,劓,翱,魉,魈,徼,歙,膳,膦,膙,鲮,鲱,鲲,鲳,鲴,鲵,鲷,鲻,獴,獭,獬,邂,鹧,廨,赟,瘰,廪,瘿,瘵,瘴,癃,瘳,斓,麇,麈,嬴,壅,羲,糗,瞥,甑,燎,燠,燔,燧,濑,濉,潞,澧,澹,澥,澶,濂,褰,寰,窸,褶,禧,嬖,犟,隰,嬗,颡,缱,缲,缳,璨,璩,璐,璪,螫,擤,壕,觳,罄,擢,薹,鞡,鞬,薷,薰,藓,藁,檄,檩,懋,醢,翳,礅,磴,鹩,龋,龌,豳,壑,黻,嚏,嚅,蹑,蹒,蹊,蟥,螬,螵,疃,螳,蟑,嚓,羁,罽,罾,嶷,黜,黝,髁,髀,镡,镢,镣,镦,镧,镩,镪,镫,罅,黏,簌,篾,篼,簖,簋,鼢,黛,儡,鹪,鼾,皤,魍,龠,繇,貘,邈,貔,臌,膻,臆,臃,鲼,鲽,鳀,鳃,鳅,鳇,鳊,螽,燮,鹫,襄,糜,縻,膺,癍,麋,懑,濡,濮,濞,濠,濯,蹇,謇,邃,襁,檗,擘,孺,隳,嬷,蟊,鹬,鍪,鏊,鳌,鬈,鬃,瞽,鞯,鞨,鞫,鞧,鞣,藜,藠,藩,醪,蹙,礓,燹,餮,瞿,曛,颢,曜,躇,蹚,鹭,蟛,蟪,蟠,蟮,鹮,黠,黟,髅,髂,镬,镭,镯,馥,簟,簪,鼬,雠,艟,鳎,鳏,鳐,癞,癔,癜,癖,糨,蹩,鎏,懵,彝,邋,鬏,攉,攒,鞲,鞴,藿,蘧,蘅,麓,醮,醯,酃,霪,霭,霨,黼,嚯,蹰,蹶,蹽,蹼,蹴,蹾,蹿,蠖,蠓,蟾,蠊,黢,髋,髌,镲,籀,籁,齁,魑,艨,鳓,鳔,鳕,鳗,鳙,麒,鏖,羸,㸆,瀚,瀣,瀛,襦,谶,襞,骥,缵,瓒,攘,蘩,蘖,醴,霰,酆,矍,曦,躅,鼍,巉,黩,黥,黪,镳,镴,黧,纂,璺,鼯,臜,鳜,鳝,鳟,獾,孀,骧,瓘,鼙,醺,礴,颦,曩,鳢,癫,麝,夔,爝,灏,禳,鐾,羼,蠡,耱,懿,蘸,鹳,霾,氍,饕,躐,髑,镵,穰,饔,鬻,鬟,趱,攫,攥,颧,躜,鼹,癯,麟,蠲,蠹,躞,衢,鑫,灞,襻,纛,鬣,攮,囔,馕,戆,爨,齉";

    public static String LEVEL3 = "亍,尢,彳,卬,殳,毌,邘,戋,圢,氕,伋,仝,冮,氿,汈,氾,忉,宄,讱,扞,圲,圫,芏,芃,朳,朸,邨,吒,吖,屼,屾,辿,钆,仳,伣,伈,癿,甪,邠,犴,冱,邡,闫,汋,䜣,讻,孖,纩,玒,玓,玘,玚,刬,坉,扽,坋,扺,㧑,毐,芰,芣,苊,苉,芘,芴,芠,芤,杕,杙,杄,杧,杩,尪,尨,轪,坒,芈,旴,旵,呙,㕮,岍,坜,岠,岜,呇,冏,觃,岙,伾,㑇,伭,佖,伲,佁,飏,狃,闶,汧,汫,沄,沘,汭,㳇,沇,忮,忳,忺,祃,诇,邲,诎,诐,屃,岊,阽,䢺,阼,妧,妘,纮,驲,纻,纼,玤,玞,玱,玟,邽,邿,坥,坰,坬,坽,弆,耵,䢼,茋,苧,苾,苠,枅,㭎,枘,枍,矼,矻,匼,旿,昇,昄,昒,昈,咉,咇,咍,岵,岽,岨,岞,峂,㟃,囷,钐,钔,钖,牥,佴,垈,侁,侹,佸,佺,隹,㑊,侂,佽,侘,郈,舠,郐,郃,攽,肭,肸,肷,狉,狝,饳,忞,於,炌,炆,泙,沺,泂,泜,泃,泇,怊,峃,穸,祋,祊,鸤,弢,弨,陑,陎,卺,乸,妭,姈,迳,叕,驵,䌹,驺,绋,绐,砉,耔,㛃,玶,珇,珅,珋,玹,珌,玿,韨,垚,垯,垙,垲,埏,垍,耇,垎,垴,垟,垞,挓,垵,垏,拶,荖,荁,荙,荛,茈,茽,荄,茺,荓,茳,茛,荭,㭕,柷,柃,柊,枹,栐,柖,郚,剅,䴓,迺,厖,砆,砑,砄,耏,奓,䶮,轵,轷,轹,轺,昺,昽,盷,咡,咺,昳,昣,哒,昤,昫,昡,咥,昪,虷,虸,哃,峘,峏,峛,峗,峧,帡,钘,钜,钪,钬,钭,矧,秬,俫,舁,俜,俙,俍,垕,衎,舣,弇,侴,鸧,䏡,胠,胈,胩,胣,朏,飐,訄,饻,庤,疢,炣,炟,㶲,洭,洘,洓,洿,㳚,泚,浈,浉,洸,洑,洢,洈,洚,洺,洨,浐,㳘,洴,洣,恔,宬,窀,扂,袆,祏,祐,祕,叚,陧,陞,娀,姞,姱,姤,姶,姽,枲,绖,骃,彖,骉,恝,珪,珛,珹,琊,玼,珖,珽,珦,珫,珒,珢,珕,珝,埗,垾,垺,埆,垿,埌,埇,莰,茝,鄀,莶,莝,䓖,莙,栻,桠,桄,梠,栴,梴,栒,酎,酏,砵,砠,砫,砬,硁,恧,翃,郪,辀,辁,剕,赀,哢,晅,晊,唝,哳,哱,冔,晔,晐,晖,畖,蚄,蚆,帱,崁,峿,崄,帨,崀,赆,钷,眚,甡,笫,倻,倴,脩,倮,倕,倞,倓,倧,衃,虒,舭,舯,舥,瓞,鬯,鸰,脎,朓,胲,虓,鱽,狴,峱,狻,眢,勍,痄,疰,痃,竘,羖,羓,桊,敉,烠,烔,烶,烻,涍,浡,浭,浬,涄,涢,涐,浰,浟,浛,浼,浲,涘,悈,悃,悢,宧,窅,窊,窎,扅,扆,袪,袗,袯,祧,隺,堲,疍,陴,烝,砮,㛚,哿,翀,翂,剟,绤,骍,䂮,琎,珸,珵,琄,琈,琀,珺,掭,堎,堐,埼,掎,埫,堌,晢,掞,埪,壸,㙍,聍,菝,萚,菥,莿,䓫,勚,䓬,萆,菂,菍,菼,萣,䓨,菉,䓛,梼,梽,桲,梾,桯,梣,梌,桹,敔,厣,硔,硙,硚,硊,硍,勔,䴕,龁,逴,唪,啫,翈,㫰,晙,畤,趼,跂,蛃,蚲,蚺,啴,䎃,崧,崟,崞,崒,崌,崡,铏,\uD86D\uDCEF,\uD86D\uDFF9,铕,\uD86D\uDFFC,铖,铘,铚,铞,铥,铴,牻,牿,稆,笱,笯,偰,偡,鸺,偭,偲,偁,㿠,鄅,偓,徛,衒,舳,舲,鸼,悆,鄃,瓻,䝙,脶,脞,脟,䏲,鱾,猇,猊,猄,觖,\uD840\uDD64,庱,庼,庳,痓,䴔,竫,堃,阌,羝,羕,焆,烺,焌,淏,\uE62A,淟,淜,淴,淯,湴,涴,\uE638,㥄,惛,惔,悰,惙,寁,逭,\uE666,\uD86C\uDF6F,袼,裈,祲,\uE667,\uD86C\uDF72,谞,艴,弸,弶,\uE69D,隃,婞,娵,婼,媖,婳,婍,婌,婫,婤,婘,婠,\uE651,\uE652,\uE6AF,\uD86D\uDE26,绹,\uD86D\uDFC5,\uE653,骕,\uD86D\uDE27,絜,珷,琲,琡,琟,琔,琭,堾,堼,揕,㙘,堧,喆,堨,塅,堠,絷,\uD86A\uDCFB,\uD844\uDF9A,葜,惎,萳,葙,靬,葴,蒇,蒈,鄚,蒉,蓇,萩,蒐,葰,葎,鄑,蒎,葖,蒄,萹,棤,棽,棫,椓,椑,\uE624,鹀,椆,棓,棬,棪,椀,楗,\uE6C4,甦,酦,觌,奡,皕,硪,欹,詟,\uD86D\uDC10,辌,棐,龂,\uE6CC,黹,牚,睎,晫,晪,晱,\uD85F\uDFF9,蛑,畯,斝,喤,崶,嵁,\uE618,崾,嵅,崿,嵚,翙,\uD86D\uDDAE,圌,圐,赑,淼,赒,\uE683,铹,\uE684,铽,\uD863\uDC47,\uD86D\uDCF6,锊,锍,锎,\uE685,锓,犇,颋,稌,筀,筘,筜,筥,筅,傃,傉,翛,傒,傕,舾,畬,\uD86D\uDDAF,脿,腘,䐃,腙,腒,\uE6A0,鲃,猰,\uD86D\uDEED,猯,㺄,馉,凓,鄗,\uE61B,廋,廆,鄌,粢,遆,旐,\uE69A,焞,\uE62F,欻,\uD84F\uDE23,溚,溁,湝,渰,湓,㴔,渟,溠,渼,溇,湣,湑,溞,愐,愃,敩,甯,棨,扊,裣,祼,婻,媆,媞,㛹,媓,媂,媄,毵,矞,\uE6B0,\uD86D\uDE28,缊,缐,骙,瑃,瑓,瑅,瑆,䴖,瑖,瑝,瑔,瑀,\uD852\uDDDB,瑳,瑂,嶅,瑑,遘,髢,塥,堽,赪,摛,塝,搒,搌,蒱,蒨,蓏,蔀,蓢,蓂,蒻,蓣,椹,楪,榃,榅,楒,楞,楩,榇,椸,楙,歅,\uE674,碃,碏,\uE645,碈,䃅,硿,鄠,辒,\uE66F,\uD86D\uDC13,龆,觜,䣘,暕,鹍,\uE605,㬊,暅,跱,蜐,蜎,嵲,赗,骱,锖,\uD86D\uDCF9,锘,锳,锧,锪,\uE688,锫,锬,\uE689,稑,稙,䅟,\uE647,筻,筼,筶,筦,筤,傺,鹎,僇,艅,艉,谼,貆,腽,腨,腯,鲉,鲊,鲌,䲟,\uE6B5,\uE6B6,鲏,雊,猺,飔,觟,\uD859\uDF7C,馌,裛,廒,瘀,瘅,鄘,鹒,鄜,麀,鄣,阘,\uD86D\uDD36,煁,煃,煴,煋,煟,煓,滠,溍,溹,滆,滉,溦,溵,漷,滧,滘,滍,愭,慥,慆,塱,\uD86C\uDF00,裼,禋,禔,禘,禒,谫,鹔,\uD86D\uDDB3,愍,嫄,媱,戤,勠,戣,\uD86D\uDE2A,\uD86D\uDE2C,缞,耤,瑧,\uD86D\uDFA9,瑨,瑱,瑷,瑢,斠,摏,墕,墈,墐,墘,摴,銎,\uD845\uDC13,墚,撖,\uD86A\uDD17,靽,鞁,蔌,蔈,蓰,蔹,蔊,嘏,榰,榑,槚,\uD84D\uDDCB,槜,榍,疐,\uE6C6,酺,酾,酲,酴,碶,䃎,\uE646,碨,\uD855\uDD32,碹,碥,劂,\uD86D\uDE96,䴗,夥,瞍,鹖,㬎,跽,蜾,幖,嶍,圙,\uD863\uDC4F,锺,锼,锽,\uE68C,锾,锿,镃,镄,镅,馝,鹙,箨,箖,劄,僬,僦,僔,僎,槃,㙦,鲒,鲕,\uD86D\uDE95,鲖,鲗,鲘,鲙,\uE6B7,\uE6B8,\uD867\uDF7E,夐,獍,飗,\uE6C7,凘,廑,廙,瘗,瘥,瘕,鲝,鄫,熇,漹,漖,潆,漤,潩,漼,漴,㽏,漈,漋,漻,慬,窬,窭,㮾,\uE669,褕,禛,禚,隩,嫕,嫭,嫜,嫪,\uE654,㻬,麹,璆,漦,叇,墣,墦,墡,劐,薁,蕰,蔃,鼒,槱,鹝,磏,磉,殣,慭,霅,暵,暲,暶,踦,踣,䗖,蝘,蝲,蝤,噇,噂,噀,罶,嶲,嶓,㠇,嶟,嶒,镆,镈,镋,镎,\uE690,镕,稹,儇,皞,皛,䴘,艎,艏,鹟,\uD867\uDF83,鲦,鲪,鲬,橥,觭,鹠,鹡,糇,糈,翦,鹢,鹣,熛,潖,潵,㵐,澂,澛,瑬,潽,潾,潏,憭,憕,\uE6C8,戭,褯,禤,\uD86C\uDF7D,嫽,遹,\uE6B2,璥,璲,璒,憙,擐,鄹,薳,鞔,黇,\uE659,蕗,薢,蕹,橞,橑,橦,醑,觱,磡,\uD855\uDD62,磜,豮,\uD86D\uDFE6,\uE6CD,\uD86E\uDC1C,鹾,虤,暿,曌,曈,㬚,蹅,踶,䗛,螗,疁,㠓,幪,\uD86A\uDE58,嶦,\uE691,\uD863\uDC51,\uE692,馞,穄,篚,篯,簉,鼽,衠,盦,螣,縢,鲭,鲯,鲰,鲺,鲹,\uD86D\uDDF4,亸,癀,瘭,\uE6C9,羱,糒,燋,熻,燊,燚,燏,濩,濋,澪,澽,澴,澭,澼,憷,憺,懔,黉,嬛,鹨,翯,\uD86C\uDD37,璱,\uD852\uDE7D,璬,璮,髽,擿,薿,薸,檑,櫆,檞,醨,繄,磹,磻,瞫,瞵,蹐,蟏,㘎,\uE693,镤,\uE695,\uD86D\uDD0D,镥,镨,\uE696,\uD863\uDC54,\uE697,\uD86D\uDD0E,矰,穙,穜,穟,簕,簃,簏,儦,魋,斶,艚,\uE6CA,谿,䲠,\uE6BA,鲾,\uE6BB,鲿,鳁,鳂,鳈,鳉,獯,䗪,馘,襕,襚,\uE6BC,螱,甓,嬬,嬥,\uD858\uDE21,\uD86C\uDD38,瓀,釐,鬶,爇,鞳,鞮,\uE65A,藟,藦,藨,鹲,檫,黡,礞,礌,\uD855\uDDA8,蹢,蹜,蟫,䗴,嚚,髃,镮,镱,酂,馧,簠,簝,簰,鼫,鼩,皦,臑,䲢,鳑,鳒,鹱,鹯,癗,\uD859\uDC8D,旞,翷,冁,䎖,瀔,瀍,瀌,襜,䴙,\uE655,嚭,㰀,鬷,醭,蹯,蠋,翾,鳘,儳,儴,鼗,\uE6BF,\uD867\uDF8C,鳚,鳛,麑,麖,蠃,彟,嬿,鬒,蘘,欂,醵,颥,甗,\uD861\uDFE0,巇,酅,髎,犨,\uE6C0,\uD862\uDF49,㸌,爔,瀱,瀹,瀼,瀵,襫,孅,骦,\uE656,耰,\uD852\uDEC9,瓖,鬘,趯,\uE6CE,罍,鼱,鳠,鳡,鳣,爟,爚,灈,韂,糵,蘼,礵,鹴,躔,皭,龢,鳤,亹,籥,鼷,\uD86D\uDEAD,玃,醾,齇,觿,蠼";
}

