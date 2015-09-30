package study.cto51.orcl;

public class TwoOrac_Mysql {
	/*
	 * INSERT INTO womax_admin (ID, typegroupcode, typegroupname) VALUES
	 * ('40289f5e4f16fdc7014f17092f460048', 'icontype', '图标类型'); INSERT INTO
	 * womax_admin (ID, typegroupcode, typegroupname) VALUES
	 * ('40289f5e4f16fdc7014f17092f520049', 'order', '订单类型'); INSERT INTO
	 * womax_admin (ID, typegroupcode, typegroupname) VALUES
	 * ('40289f5e4f16fdc7014f17092f58004a', 'custom', '客户类型'); INSERT INTO
	 * womax_admin (ID, typegroupcode, typegroupname) VALUES
	 * ('40289f5e4f16fdc7014f17092f5d004b', 'service', '服务项目类型'); INSERT INTO
	 * womax_admin (ID, typegroupcode, typegroupname) VALUES
	 * ('40289f5e4f16fdc7014f17092f62004c', 'searchmode', '查询模式'); INSERT INTO
	 * womax_admin (ID, typegroupcode, typegroupname) VALUES
	 * ('40289f5e4f16fdc7014f17092f67004d', 'yesorno', '逻辑条件'); INSERT INTO
	 * womax_admin (ID, typegroupcode, typegroupname) VALUES
	 * ('40289f5e4f16fdc7014f17092f6c004e', 'fieldtype', '字段类型'); INSERT INTO
	 * womax_admin (ID, typegroupcode, typegroupname) VALUES
	 * ('40289f5e4f16fdc7014f17092f70004f', 'database', '数据表'); INSERT INTO
	 * womax_admin (ID, typegroupcode, typegroupname) VALUES
	 * ('40289f5e4f16fdc7014f17092f740050', 'fieltype', '文档分类'); INSERT INTO
	 * womax_admin (ID, typegroupcode, typegroupname) VALUES
	 * ('40289f5e4f16fdc7014f17092f780051', 'sex', '性别类');
	 */
	CREATE TABLE

	SX_LCCONT
	(

	grpcontno          VARCHAR(20) NOT NULL,

	contno             VARCHAR(20) NOT NULL,

	proposalcontno     VARCHAR(20) NOT NULL,

	prtno              VARCHAR(20) NOT NULL,

	conttype           VARCHAR(2),

	familytype         VARCHAR(1),

	familyid           VARCHAR(10),

	poltype            VARCHAR(1),

	cardflag           VARCHAR(1),

	managecom          VARCHAR(10) NOT NULL,

	executecom         VARCHAR(10),

	agentcom           VARCHAR(20),

	agentcode          VARCHAR(10) NOT NULL,

	agentgroup         VARCHAR(12),

	agentcode1         VARCHAR(10),

	agenttype          VARCHAR(20),

	salechnl           VARCHAR(2),

	HANDLER            VARCHAR(10),

	PASSWORD           VARCHAR(16),

	appntno            VARCHAR(24),

	appntname          VARCHAR(120),

	appntsex           VARCHAR(1),
	  appntbirthday      DATE,

	appntidtype        VARCHAR(2),

	appntidno          VARCHAR(20),

	insuredno          VARCHAR(24) NOT NULL,

	insuredname        VARCHAR(120),

	insuredsex         VARCHAR(1),
	  insuredbirthday    DATE,

	insuredidtype      VARCHAR(2),

	insuredidno        VARCHAR(20),
	  payintv            INT,

	paymode            VARCHAR(2),

	paylocation        VARCHAR(1),

	disputedflag       VARCHAR(1),

	outpayflag         VARCHAR(1),

	getpolmode         VARCHAR(1),

	signcom            VARCHAR(10) NOT NULL,
	  signdate           DATE,

	signtime           VARCHAR(8),

	consignno          VARCHAR(20),

	bankcode           VARCHAR(10),

	bankaccno          VARCHAR(40),

	accname            VARCHAR(60),
	  printcount         INT,
	  losttimes          INT,

	lang               VARCHAR(1),

	currency           VARCHAR(2),

	remark             VARCHAR(1600),
	  peoples            INT,

	mult               INT(20,5),

	prem               INT(18,2),

	amnt               INT(18,2),

	sumprem            INT(18,2),

	dif                INT(12,2),
	  paytodate          DATE,
	  firstpaydate       DATE,
	  cvalidate          DATE,

	inputoperator      VARCHAR(10),
	  inputdate          DATE,

	inputtime          VARCHAR(8),

	approveflag        VARCHAR(1),

	approvecode        VARCHAR(10),
	  approvedate        DATE,

	approvetime        VARCHAR(8),

	uwflag             VARCHAR(1),

	uwoperator         VARCHAR(10),
	  uwdate             DATE,

	uwtime             VARCHAR(8),

	appflag            VARCHAR(1) NOT NULL,
	  polapplydate       DATE,
	  getpoldate         DATE,

	getpoltime         VARCHAR(8),
	  customgetpoldate   DATE,

	state              VARCHAR(10),

	operator           VARCHAR(10) NOT NULL,
	  MAKEDATE           DATE NOT NULL,

	MAKETIME           VARCHAR(8) NOT NULL,
	  modifydate         DATE NOT NULL,

	modifytime         VARCHAR(8) NOT NULL,

	firsttrialoperator VARCHAR(10),
	  firsttrialdate     DATE,

	firsttrialtime     VARCHAR(8),

	receiveoperator    VARCHAR(10),
	  receivedate        DATE,

	receivetime        VARCHAR(8),

	tempfeeno          VARCHAR(20),

	selltype           VARCHAR(2),

	forceuwflag        VARCHAR(1),

	forceuwreason      VARCHAR(500),

	newbankcode        VARCHAR(10),

	newbankaccno       VARCHAR(40),

	newaccname         VARCHAR(60),

	newpaymode         VARCHAR(2),

	agentbankcode      VARCHAR(6),

	bankagent          VARCHAR(20),

	bankagentname      VARCHAR(100),

	bankagenttel       VARCHAR(100),

	prodsetcode        VARCHAR(100),

	mac                VARCHAR(256),

	PRIMARY KEY (contno)
	)
	
	INSERT INTO `sx_lccont` (grpcontno, contno, proposalcontno, prtno, conttype, familytype, familyid, poltype, cardflag, managecom, executecom, agentcom, agentcode, agentgroup, agentcode1, agenttype, salechnl, HANDLER, PASSWORD, appntno, appntname, appntsex, appntbirthday, appntidtype, appntidno, insuredno, insuredname, insuredsex, insuredbirthday, insuredidtype, insuredidno, payintv, paymode, paylocation, disputedflag, outpayflag, getpolmode, signcom, signdate, signtime, consignno, bankcode, bankaccno, accname, printcount, losttimes, lang, currency, remark, peoples, mult, prem, amnt, sumprem, dif, paytodate, firstpaydate, cvalidate, inputoperator, inputdate, inputtime, approveflag, approvecode, approvedate, approvetime, uwflag, uwoperator, uwdate, uwtime, appflag, polapplydate, getpoldate, getpoltime, customgetpoldate, state, operator, MAKEDATE, MAKETIME, modifydate, modifytime, firsttrialoperator, firsttrialdate, firsttrialtime, receiveoperator, receivedate, receivetime, tempfeeno, selltype, forceuwflag, forceuwreason, newbankcode, newbankaccno, newaccname, newpaymode, agentbankcode, bankagent, bankagentname, bankagenttel, prodsetcode, mac)
	VALUES ('314100000000033', '0000438409', '0000438409', '314100000000033', '2', '0', NULL, '0', '0', '864100', NULL, NULL, '31410002', '000000001021', NULL, '01', '2', NULL, NULL, '90000000387', '中国邮政储蓄银行股份有限公司濮阳市分行', NULL, NULL, NULL, NULL, '00002604309', '李芳', '1', DATE_FORMAT('20-10-1986', '%m-%d-%Y'), '0', '410928198610202127', 0, NULL, NULL, NULL, NULL, NULL, '864100', NULL, NULL, NULL, NULL, NULL, NULL, 0, 0, NULL, NULL, NULL, 1, 0, 98.14, 176000, 0, 0, DATE_FORMAT('24-08-2014', '%m-%d-%Y'), DATE_FORMAT('22-08-2013', '%m-%d-%Y'), DATE_FORMAT('24-08-2013', '%m-%d-%Y'), '4100448', DATE_FORMAT('22-08-2013', '%m-%d-%Y'), '15:44:04', '9', '4100417', DATE_FORMAT('22-08-2013', '%m-%d-%Y'), '16:11:39', '9', '1000182', DATE_FORMAT('22-08-2013', '%m-%d-%Y'), '16:52:08', '0', DATE_FORMAT('22-08-2013', '%m-%d-%Y'), NULL, NULL, NULL, '0', '1000182', DATE_FORMAT('22-08-2013', '%m-%d-%Y'), '15:35:48', DATE_FORMAT('22-08-2013', '%m-%d-%Y'), '16:52:08', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '4005DFA2056EA6AA');
}
