inherited dmReportImp: TdmReportImp
  OldCreateOrder = True
  Left = 452
  Top = 190
  Height = 546
  Width = 734
  object cqSetOperator: TKCWVQuery
    ID = '操作员查询一'
    InputBindings = <>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 820302
    Left = 80
    Top = 82
  end
  object KCTradeSubject: TKCWVQuery
    ID = '交易科目情况表'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sorder1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sorder2'
      end
      item
        ParamName = '操作员代码'
        FieldName = 'scust_no'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 900122
    Left = 80
    Top = 226
  end
  object KCTotSubject: TKCWVQuery
    ID = '科目总账表'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '会计科目'
        FieldName = 'vsvarstr0'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sdate1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sdate2'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846705
    Left = 80
    Top = 178
  end
  object KCWSubBalanceRep: TKCWVQuery
    ID = '科目余额表'
    InputBindings = <
      item
        ParamName = '科目号'
        FieldName = 'scust_auth'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sdate1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sdate2'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846701
    Left = 156
    Top = 16
  end
  object KCWBusiReport: TKCWVQuery
    ID = '商户结算表'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '商户帐号'
        FieldName = 'lvol3'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sdate1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sdate2'
      end
      item
        ParamName = '显示级别'
        FieldName = 'lsafe_level'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846706
    Timeout = 5000
    Left = 160
    Top = 114
  end
  object kcTicketCashRpt_R: TKCWVQuery
    ID = '票据现金报表_R'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '网点号'
        FieldName = 'lbank_acc_type2'
      end
      item
        ParamName = '操作员号'
        FieldName = 'semp_no'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sdate1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sdate2'
      end
      item
        ParamName = '科目类型'
        FieldName = 'lvol1'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846703
    Timeout = 5000
    Left = 160
    Top = 66
  end
  object KCWBusiReportDay: TKCWVQuery
    ID = '商户当日结算表'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '商户帐号'
        FieldName = 'lvol3'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sdate1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sdate2'
      end
      item
        ParamName = '级别'
        FieldName = 'lsafe_level'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846110
    Timeout = 5000
    Left = 240
    Top = 34
  end
  object Dataset: TKCDataset
    MaxRows = 0
    AggregateFields = <>
    RequestType = 0
    Params = <>
    Left = 440
    Top = 16
  end
  object kcBusiGatherRep: TKCWVQuery
    ID = '商户汇总结算表'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '商户帐号'
        FieldName = 'lvol3'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sdate1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sdate2'
      end
      item
        ParamName = '级别'
        FieldName = 'lsafe_level'
      end
      item
        ParamName = '商户类型'
        FieldName = 'lvol1'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846709
    Timeout = 5000
    Left = 160
    Top = 162
  end
  object kcSubject: TKCWVQuery
    ID = '科目表查询'
    InputBindings = <
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846112
    Left = 19
    Top = 107
  end
  object KCCashRpt: TKCWVQuery
    ID = '票据现金报表'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '网点号'
        FieldName = 'lbank_acc_type2'
      end
      item
        ParamName = '操作员号'
        FieldName = 'semp_no'
      end
      item
        ParamName = '餐次'
        FieldName = 'lbank_acc_type'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846109
    Timeout = 5000
    Left = 160
    Top = 210
  end
  object kcBusiRunStatRpt: TKCWVQuery
    ID = '商户营业情况表'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sorder1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sorder2'
      end
      item
        ParamName = '标志'
        FieldName = 'sstock_code'
      end
      item
        ParamName = '商户号'
        FieldName = 'scust_auth'
      end
      item
        ParamName = '卡类型'
        FieldName = 'sname'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846734
    Timeout = 5000
    Left = 16
    Top = 154
  end
  object kcOperRpt: TKCWVQuery
    ID = '操作员业务报表'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '网点号'
        FieldName = 'lbank_acc_type2'
      end
      item
        ParamName = '操作员号'
        FieldName = 'semp_no'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sdate1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sdate2'
      end
      item
        ParamName = '交易类型'
        FieldName = 'semail'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846715
    Timeout = 5000
    Left = 80
    Top = 274
  end
  object kcOperCashTot: TKCWVQuery
    ID = '操作员现金汇总报表'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '网点号'
        FieldName = 'lbank_acc_type2'
      end
      item
        ParamName = '操作员号'
        FieldName = 'semp_no'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sdate1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sdate2'
      end
      item
        ParamName = '科目类型'
        FieldName = 'lvol1'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846716
    Timeout = 5000
    Left = 80
    Top = 130
  end
  object conSLite: TZConnection
    Protocol = 'sqlite-3'
    Connected = True
    Left = 440
    Top = 113
  end
  object cqSetBusiInfo: TKCWVQuery
    ID = '商户信息维护Q'
    InputBindings = <
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '操作标志'
        FieldName = 'sstat_type'
      end
      item
        ParamName = '商户编号'
        FieldName = 'lvol0'
      end
      item
        ParamName = '中心商户号'
        FieldName = 'sname'
      end
      item
        ParamName = '省商户编号'
        FieldName = 'sname2'
      end
      item
        ParamName = '商户状态'
        FieldName = 'sstatus1'
      end
      item
        ParamName = '商户名'
        FieldName = 'snote'
      end
      item
        ParamName = '商户英文名称'
        FieldName = 'snote2'
      end
      item
        ParamName = '商户简称'
        FieldName = 'semail'
      end
      item
        ParamName = '商户类型'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '行业类型'
        FieldName = 'sbranch_code1'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 2004
    Left = 16
    Top = 10
  end
  object KCAtmRpt: TKCWVQuery
    ID = '圈存统计报表'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '标志'
        FieldName = 'sstock_code'
      end
      item
        ParamName = '卡类型'
        FieldName = 'sname'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sorder1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sorder2'
      end
      item
        ParamName = '终端编号'
        FieldName = 'scust_auth2'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846730
    Timeout = 5000
    Left = 240
    Top = 82
  end
  object KCReFillTermRtp: TKCWVQuery
    ID = '充值终端统计报表'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '标志'
        FieldName = 'sstock_code'
      end
      item
        ParamName = '卡类型'
        FieldName = 'sname'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sorder1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sorder2'
      end
      item
        ParamName = '终端编号'
        FieldName = 'scust_auth2'
      end
      item
        ParamName = '充值操作员'
        FieldName = 'semp_no'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846731
    Timeout = 5000
    Left = 240
    Top = 130
  end
  object KCExpendRpt: TKCWVQuery
    ID = '消费终端统计报表'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '标志'
        FieldName = 'sstock_code'
      end
      item
        ParamName = '卡类型'
        FieldName = 'sname'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sorder1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sorder2'
      end
      item
        ParamName = '终端编号'
        FieldName = 'scust_auth2'
      end
      item
        ParamName = '商户号'
        FieldName = 'scust_auth'
      end
      item
        ParamName = '日期类型'
        FieldName = 'lvol1'
        DefaultValue = 1
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846732
    Timeout = 5000
    Left = 240
    Top = 178
  end
  object KCPkgFileRpt: TKCWVQuery
    ID = '包裹文件统计报表'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '标志'
        FieldName = 'sstock_code'
      end
      item
        ParamName = '卡类型'
        FieldName = 'sname'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sorder1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sorder2'
      end
      item
        ParamName = '终端编号'
        FieldName = 'scust_auth2'
      end
      item
        ParamName = '商户号'
        FieldName = 'scust_auth'
      end
      item
        ParamName = '文件编号'
        FieldName = 'lvol0'
        DefaultValue = 0
      end
      item
        ParamName = '包裹编号'
        FieldName = 'scust_no'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846733
    Timeout = 5000
    Left = 240
    Top = 226
  end
  object KCTradeStat: TKCWVQuery
    ID = '网点交易统计'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '网点号'
        FieldName = 'sname2'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sorder1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sorder2'
      end
      item
        ParamName = '交易类型'
        FieldName = 'semail'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846735
    Timeout = 5000
    Left = 240
    Top = 274
  end
  object KCPersonStat: TKCWVQuery
    ID = '个人业务统计'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sorder1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sorder2'
      end
      item
        ParamName = '卡类型'
        FieldName = 'sname2'
      end
      item
        ParamName = '卡号'
        FieldName = 'semail'
      end
      item
        ParamName = '手机号'
        FieldName = 'sname'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846736
    Timeout = 5000
    Left = 240
    Top = 322
  end
  object KCPubCardStat: TKCWVQuery
    ID = '发卡统计报表'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '卡商'
        FieldName = 'sall_name'
      end
      item
        ParamName = '卡类型'
        FieldName = 'semail'
      end
      item
        ParamName = '开始日期'
        FieldName = 'sorder1'
      end
      item
        ParamName = '结束日期'
        FieldName = 'sorder2'
      end
      item
        ParamName = '发卡部门'
        FieldName = 'sname'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 846737
    Timeout = 5000
    Left = 16
    Top = 202
  end
  object KCBusiBalQ: TKCWVQuery
    ID = '商户余额查询'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '商户名称'
        FieldName = 'sall_name'
      end
      item
        ParamName = '商户号'
        FieldName = 'lvol2'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 2060
    Timeout = 5000
    Left = 16
    Top = 250
  end
  object KCPatchPay: TKCWVQuery
    ID = '商户批量付款'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '商户0'
        FieldName = 'vsvarstr0'
      end
      item
        ParamName = '商户1'
        FieldName = 'vsvarstr1'
      end
      item
        ParamName = '商户2'
        FieldName = 'vsvarstr2'
      end
      item
        ParamName = '商户3'
        FieldName = 'vsvarstr3'
      end
      item
        ParamName = '附言'
        FieldName = 'snote'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 2061
    Timeout = 5000
    Left = 16
    Top = 298
  end
  object cqPayFileQ: TKCWVQuery
    ID = '付款文件查询'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '付款批次号'
        FieldName = 'spager'
      end
      item
        ParamName = '委托日期'
        FieldName = 'sdate0'
      end
      item
        ParamName = '处理状态'
        FieldName = 'sstat_type'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 2062
    Left = 80
    Top = 322
  end
  object cqPayDetailQ: TKCWVQuery
    ID = '付款明细查询'
    InputBindings = <
      item
        ParamName = '#营业部代码'
        FieldName = 'sbranch_code0'
      end
      item
        ParamName = '#职工代码'
        FieldName = 'semp'
      end
      item
        ParamName = '#网卡地址'
        FieldName = 'sstation0'
      end
      item
        ParamName = '付款批次号'
        FieldName = 'spager'
      end
      item
        ParamName = '付款流水号'
        FieldName = 'scust_limit'
      end
      item
        ParamName = '委托日期'
        FieldName = 'sdate0'
      end
      item
        ParamName = '清算日期'
        FieldName = 'sdate1'
      end
      item
        ParamName = '商户号'
        FieldName = 'lvol2'
      end
      item
        ParamName = '收款方账户'
        FieldName = 'sbank_acc'
      end
      item
        ParamName = '收款方账户名'
        FieldName = 'sbankname'
      end
      item
        ParamName = '收款人开户行号'
        FieldName = 'sname2'
      end
      item
        ParamName = '处理状态'
        FieldName = 'sstat_type'
      end>
    OutputBindings = <
      item
        ParamName = '查询结果集'
        FieldName = '@Dataset'
      end
      item
        ParamName = '返回码'
        FieldName = '@Return'
      end
      item
        ParamName = '返回信息'
        FieldName = 'vsmess'
      end>
    RequestType = 2063
    Left = 80
    Top = 370
  end
end
