package com.fragma.dao;

import com.fragma.config.ConfigurationHelper;
import com.fragma.dto.MainDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class ReportDao {

    static Logger LOG = LoggerFactory.getLogger(ReportDao.class);

    private final JdbcTemplate jdbcTemplate;
    private final ConfigurationHelper configurationHelper;
    int SLNoForBahrain=0;
    int SLNoForKuwait=0;
    int SLNoForQatar=0;
    int SLNoForUAE=0;

    @Autowired
    public ReportDao(@Qualifier("hiveJdbcTemplate") JdbcTemplate jdbcTemplate, ConfigurationHelper configurationHelper) {
        this.jdbcTemplate = jdbcTemplate;
        this.configurationHelper = configurationHelper;

    }

    public void getBahrainCIFlevelCount(MainDto mainDto){
        LOG.info("***** executing getBahrainCIFlevelCount *****");
        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override

            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                LOG.info("Query = "+ ConfigurationHelper.getBahrainCIFlevelquery() );
                PreparedStatement ps = connection.prepareStatement(ConfigurationHelper.getBahrainCIFlevelquery());

                return ps;
            }
        },new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

                long customer_count = resultSet.getLong("customer_count");

                LOG.info("Bahrain CIF Level Count:"+customer_count);

                mainDto.setBahrainCIFLevelCount(customer_count);


            }
        });
    }

    public void getBahrainAccountlevelCount(MainDto mainDto){
        LOG.info("***** executing getBahrainAccountlevelCount *****");
        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override

            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                LOG.info("Query = "+ ConfigurationHelper.getBahrainAccountlevelquery() );
                PreparedStatement ps = connection.prepareStatement(ConfigurationHelper.getBahrainAccountlevelquery());

                return ps;
            }
        },new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

                long cust_acct_count = resultSet.getLong("cust_acct_count");

                LOG.info("Bharain Account Level Count:"+cust_acct_count);

                mainDto.setBahrainAccountLevelCount(cust_acct_count);


            }
        });
    }


    public void getKuwaitCIFlevelCount(MainDto mainDto){
        LOG.info("***** executing getKuwaitCIFlevelCount *****");
        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override

            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                LOG.info("Query = "+ ConfigurationHelper.getKuwaitCIFlevelquery() );
                PreparedStatement ps = connection.prepareStatement(ConfigurationHelper.getKuwaitCIFlevelquery());

                return ps;
            }
        },new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

                long customer_count = resultSet.getLong("customer_count");

                LOG.info("Kuwait CIF Level Count:"+customer_count);

                mainDto.setKuwaitCIFLevelCount(customer_count);


            }
        });
    }

    public void getKuwaitAccountlevelCount(MainDto mainDto){
        LOG.info("***** executing geKuwaitAccountlevelCount *****");
        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override

            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                LOG.info("Query = "+ ConfigurationHelper.getKuwaitAccountlevelquery() );
                PreparedStatement ps = connection.prepareStatement(ConfigurationHelper.getKuwaitAccountlevelquery());

                return ps;
            }
        },new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

                long cust_acct_count = resultSet.getLong("cust_acct_count");

                LOG.info("Kuwait Account Level Count:"+cust_acct_count);

                mainDto.setKuwaitAccountLevelCount(cust_acct_count);


            }
        });
    }

    public void getQatarCIFlevelCount(MainDto mainDto){
        LOG.info("***** executing getQatarCIFlevelCount *****");
        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override

            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                LOG.info("Query = "+ ConfigurationHelper.getQatarCIFlevelquery() );
                PreparedStatement ps = connection.prepareStatement(ConfigurationHelper.getQatarCIFlevelquery());

                return ps;
            }
        },new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

                long customer_count = resultSet.getLong("customer_count");

                LOG.info("Qatar CIF Level Count:"+customer_count);

                mainDto.setQatarCIFLevelCount(customer_count);


            }
        });
    }

    public void getQatarAccountlevelCount(MainDto mainDto){
        LOG.info("***** executing getQatarAccountlevelCount *****");
        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override

            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                LOG.info("Query = "+ ConfigurationHelper.getQatarAccountlevelquery() );
                PreparedStatement ps = connection.prepareStatement(ConfigurationHelper.getQatarAccountlevelquery());

                return ps;
            }
        },new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

                long cust_acct_count = resultSet.getLong("cust_acct_count");

                LOG.info("Qatar Account Level Count:"+cust_acct_count);

                mainDto.setQatarAccountLevelCount(cust_acct_count);


            }
        });
    }

    public void getUAECIFlevelCount(MainDto mainDto){
        LOG.info("***** executing getUAECIFlevelCount *****");
        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override

            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                LOG.info("Query = "+ ConfigurationHelper.getUaeCIFlevelquery() );
                PreparedStatement ps = connection.prepareStatement(ConfigurationHelper.getUaeCIFlevelquery());

                return ps;
            }
        },new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

                long customer_count = resultSet.getLong("customer_count");

                LOG.info("UAE CIF Level Count:"+customer_count);

                mainDto.setUaeCIFLevelCount(customer_count);


            }
        });
    }

    public void getUAEAccountlevelCount(MainDto mainDto){
        LOG.info("***** executing getUAEccountlevelCount *****");
        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override

            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                LOG.info("Query = "+ ConfigurationHelper.getUaeAccountlevelquery() );
                PreparedStatement ps = connection.prepareStatement(ConfigurationHelper.getUaeAccountlevelquery());

                return ps;
            }
        },new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

                long cust_acct_count = resultSet.getLong("cust_acct_count");

                LOG.info("UAE Account Level Count:"+cust_acct_count);

                mainDto.setUaeAccountLevelCount(cust_acct_count);


            }
        });
    }

    public void getExcelDataForBahrain(MainDto mainDto){
        LOG.info("***** executing getExcelDataForBahrain *****");
        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override

            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                LOG.info("Query = "+ ConfigurationHelper.getExcelQueryForBahrain() );
                PreparedStatement ps = connection.prepareStatement(ConfigurationHelper.getExcelQueryForBahrain());

                return ps;
            }
        },new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

                String customerNo =isNullOrEmpty (resultSet.getString("customer_no"));
                String customerType = isNullOrEmpty(resultSet.getString("customer_type"));
                String customerName1 =isNullOrEmpty (resultSet.getString("customer_name1"));
                String cifStatus = isNullOrEmpty(resultSet.getString("cif_status"));
                String cifCreationDate = isNullOrEmpty(resultSet.getString("cif_creation_date"));
                String customerCategory = isNullOrEmpty(resultSet.getString("customer_category"));
                String frozen = isNullOrEmpty(resultSet.getString("frozen"));
                String dormant = isNullOrEmpty(resultSet.getString("dormant"));
                String compMis1 = isNullOrEmpty(resultSet.getString("comp_mis_1"));
                String branchCode = isNullOrEmpty(resultSet.getString("branch_code"));
                String custAcNo = isNullOrEmpty(resultSet.getString("cust_ac_no"));
                String accountClass = isNullOrEmpty(resultSet.getString("account_class"));
                String acDesc = isNullOrEmpty(resultSet.getString("ac_desc"));
                String ccy = isNullOrEmpty(resultSet.getString("ccy"));
                String accStatus = isNullOrEmpty(resultSet.getString("acc_status"));
                String acOpenDate = isNullOrEmpty(resultSet.getString("ac_open_date"));
                String acStatNoDr = isNullOrEmpty(resultSet.getString("ac_stat_no_dr"));
                String acStatNoCr = isNullOrEmpty(resultSet.getString("ac_stat_no_cr"));
                String acStatDormant = isNullOrEmpty(resultSet.getString("ac_stat_dormant"));
                String acStatFrozen = isNullOrEmpty(resultSet.getString("ac_stat_frozen"));
                String nationality = isNullOrEmpty(resultSet.getString("nationality"));
                String accountClassDescription = isNullOrEmpty(resultSet.getString("ACCOUNT_CLASS_DESCRIPTION"));
                double drTurnover = resultSet.getDouble("DR_TURNOVER");
                double crTurnover = resultSet.getDouble("CR_TURNOVER");
                String inward_count_103 = isNullOrEmpty(resultSet.getString("inward_count_103"));
                String total_inward_amt_103 = isNullOrEmpty(resultSet.getString("total_inward_amt_103"));

                String inward_monthly_avg_103 = isNullOrEmpty(resultSet.getString("inward_monthly_avg_103"));
                String outward_count_103 = isNullOrEmpty(resultSet.getString("outward_count_103"));
                String total_outward_amt_103 = isNullOrEmpty(resultSet.getString("total_outward_amt_103"));
                String outward_monthly_avg_103 = isNullOrEmpty(resultSet.getString("outward_monthly_avg_103"));
                String inward_count_202 = isNullOrEmpty(resultSet.getString("inward_count_202"));
                String total_inward_amt_202 = isNullOrEmpty(resultSet.getString("total_inward_amt_202"));
                String inward_monthly_avg_202 = isNullOrEmpty(resultSet.getString("inward_monthly_avg_202"));
                String outward_count_202 = isNullOrEmpty(resultSet.getString("outward_count_202"));
                String total_outward_amt_202 = isNullOrEmpty(resultSet.getString("total_outward_amt_202"));
                String outward_monthly_avg_202 = isNullOrEmpty(resultSet.getString("outward_monthly_avg_202"));


                mainDto.papulateBahrainExcelData(++SLNoForBahrain,customerNo,customerType,customerName1,cifStatus,cifCreationDate,customerCategory,frozen,dormant,compMis1,branchCode,custAcNo,accountClass,acDesc,ccy,accStatus,acOpenDate,acStatNoDr,acStatNoCr,acStatDormant,acStatFrozen,nationality,accountClassDescription,drTurnover,crTurnover,inward_count_103,total_inward_amt_103,inward_monthly_avg_103,outward_count_103,total_outward_amt_103,outward_monthly_avg_103,inward_count_202,total_inward_amt_202,inward_monthly_avg_202,outward_count_202,total_outward_amt_202,outward_monthly_avg_202);











            }
        });
    }

    public void getExcelDataForKuwait(MainDto mainDto){
        LOG.info("***** executing getExcelDataForKuwait *****");
        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override

            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                LOG.info("Query = "+ ConfigurationHelper.getExcelQueryForKuwait() );
                PreparedStatement ps = connection.prepareStatement(ConfigurationHelper.getExcelQueryForKuwait());

                return ps;
            }
        },new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

                String customerNo =isNullOrEmpty (resultSet.getString("customer_no"));
                String customerType = isNullOrEmpty(resultSet.getString("customer_type"));
                String customerName1 =isNullOrEmpty (resultSet.getString("customer_name1"));
                String cifStatus = isNullOrEmpty(resultSet.getString("cif_status"));
                String cifCreationDate = isNullOrEmpty(resultSet.getString("cif_creation_date"));
                String customerCategory = isNullOrEmpty(resultSet.getString("customer_category"));
                String frozen = isNullOrEmpty(resultSet.getString("frozen"));
                String dormant = isNullOrEmpty(resultSet.getString("dormant"));
                String compMis1 = isNullOrEmpty(resultSet.getString("comp_mis_1"));
                String branchCode = isNullOrEmpty(resultSet.getString("branch_code"));
                String custAcNo = isNullOrEmpty(resultSet.getString("cust_ac_no"));
                String accountClass = isNullOrEmpty(resultSet.getString("account_class"));
                String acDesc = isNullOrEmpty(resultSet.getString("ac_desc"));
                String ccy = isNullOrEmpty(resultSet.getString("ccy"));
                String accStatus = isNullOrEmpty(resultSet.getString("acc_status"));
                String acOpenDate = isNullOrEmpty(resultSet.getString("ac_open_date"));
                String acStatNoDr = isNullOrEmpty(resultSet.getString("ac_stat_no_dr"));
                String acStatNoCr = isNullOrEmpty(resultSet.getString("ac_stat_no_cr"));
                String acStatDormant = isNullOrEmpty(resultSet.getString("ac_stat_dormant"));
                String acStatFrozen = isNullOrEmpty(resultSet.getString("ac_stat_frozen"));
                String nationality = isNullOrEmpty(resultSet.getString("nationality"));
                String accountClassDescription = isNullOrEmpty(resultSet.getString("ACCOUNT_CLASS_DESCRIPTION"));
                double drTurnover = resultSet.getDouble("DR_TURNOVER");
                double crTurnover = resultSet.getDouble("CR_TURNOVER");
                String inward_count_103 = isNullOrEmpty(resultSet.getString("inward_count_103"));
                String total_inward_amt_103 = isNullOrEmpty(resultSet.getString("total_inward_amt_103"));

                String inward_monthly_avg_103 = isNullOrEmpty(resultSet.getString("inward_monthly_avg_103"));
                String outward_count_103 = isNullOrEmpty(resultSet.getString("outward_count_103"));
                String total_outward_amt_103 = isNullOrEmpty(resultSet.getString("total_outward_amt_103"));
                String outward_monthly_avg_103 = isNullOrEmpty(resultSet.getString("outward_monthly_avg_103"));
                String inward_count_202 = isNullOrEmpty(resultSet.getString("inward_count_202"));
                String total_inward_amt_202 = isNullOrEmpty(resultSet.getString("total_inward_amt_202"));
                String inward_monthly_avg_202 = isNullOrEmpty(resultSet.getString("inward_monthly_avg_202"));
                String outward_count_202 = isNullOrEmpty(resultSet.getString("outward_count_202"));
                String total_outward_amt_202 = isNullOrEmpty(resultSet.getString("total_outward_amt_202"));
                String outward_monthly_avg_202 = isNullOrEmpty(resultSet.getString("outward_monthly_avg_202"));


                mainDto.papulateKuwaitExcelData(++SLNoForKuwait,customerNo,customerType,customerName1,cifStatus,cifCreationDate,customerCategory,frozen,dormant,compMis1,branchCode,custAcNo,accountClass,acDesc,ccy,accStatus,acOpenDate,acStatNoDr,acStatNoCr,acStatDormant,acStatFrozen,nationality,accountClassDescription,drTurnover,crTurnover,inward_count_103,total_inward_amt_103,inward_monthly_avg_103,outward_count_103,total_outward_amt_103,outward_monthly_avg_103,inward_count_202,total_inward_amt_202,inward_monthly_avg_202,outward_count_202,total_outward_amt_202,outward_monthly_avg_202);

            }
        });
    }

    public void getExcelDataForQatar(MainDto mainDto){
        LOG.info("***** executing getExcelDataForQatar *****");
        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override

            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                LOG.info("Query = "+ ConfigurationHelper.getExcelQueryForQatar() );
                PreparedStatement ps = connection.prepareStatement(ConfigurationHelper.getExcelQueryForQatar());

                return ps;
            }
        },new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

                String customerNo =isNullOrEmpty (resultSet.getString("customer_no"));
                String customerType = isNullOrEmpty(resultSet.getString("customer_type"));
                String customerName1 =isNullOrEmpty (resultSet.getString("customer_name1"));
                String cifStatus = isNullOrEmpty(resultSet.getString("cif_status"));
                String cifCreationDate = isNullOrEmpty(resultSet.getString("cif_creation_date"));
                String customerCategory = isNullOrEmpty(resultSet.getString("customer_category"));
                String frozen = isNullOrEmpty(resultSet.getString("frozen"));
                String dormant = isNullOrEmpty(resultSet.getString("dormant"));
                String compMis1 = isNullOrEmpty(resultSet.getString("comp_mis_1"));
                String branchCode = isNullOrEmpty(resultSet.getString("branch_code"));
                String custAcNo = isNullOrEmpty(resultSet.getString("cust_ac_no"));
                String accountClass = isNullOrEmpty(resultSet.getString("account_class"));
                String acDesc = isNullOrEmpty(resultSet.getString("ac_desc"));
                String ccy = isNullOrEmpty(resultSet.getString("ccy"));
                String accStatus = isNullOrEmpty(resultSet.getString("acc_status"));
                String acOpenDate = isNullOrEmpty(resultSet.getString("ac_open_date"));
                String acStatNoDr = isNullOrEmpty(resultSet.getString("ac_stat_no_dr"));
                String acStatNoCr = isNullOrEmpty(resultSet.getString("ac_stat_no_cr"));
                String acStatDormant = isNullOrEmpty(resultSet.getString("ac_stat_dormant"));
                String acStatFrozen = isNullOrEmpty(resultSet.getString("ac_stat_frozen"));
                String nationality = isNullOrEmpty(resultSet.getString("nationality"));
                String accountClassDescription = isNullOrEmpty(resultSet.getString("ACCOUNT_CLASS_DESCRIPTION"));
                double drTurnover = resultSet.getDouble("DR_TURNOVER");
                double crTurnover = resultSet.getDouble("CR_TURNOVER");
                String inward_count_103 = isNullOrEmpty(resultSet.getString("inward_count_103"));
                String total_inward_amt_103 = isNullOrEmpty(resultSet.getString("total_inward_amt_103"));

                String inward_monthly_avg_103 = isNullOrEmpty(resultSet.getString("inward_monthly_avg_103"));
                String outward_count_103 = isNullOrEmpty(resultSet.getString("outward_count_103"));
                String total_outward_amt_103 = isNullOrEmpty(resultSet.getString("total_outward_amt_103"));
                String outward_monthly_avg_103 = isNullOrEmpty(resultSet.getString("outward_monthly_avg_103"));
                String inward_count_202 = isNullOrEmpty(resultSet.getString("inward_count_202"));
                String total_inward_amt_202 = isNullOrEmpty(resultSet.getString("total_inward_amt_202"));
                String inward_monthly_avg_202 = isNullOrEmpty(resultSet.getString("inward_monthly_avg_202"));
                String outward_count_202 = isNullOrEmpty(resultSet.getString("outward_count_202"));
                String total_outward_amt_202 = isNullOrEmpty(resultSet.getString("total_outward_amt_202"));
                String outward_monthly_avg_202 = isNullOrEmpty(resultSet.getString("outward_monthly_avg_202"));


                mainDto.papulateQatarExcelData(++SLNoForQatar,customerNo,customerType,customerName1,cifStatus,cifCreationDate,customerCategory,frozen,dormant,compMis1,branchCode,custAcNo,accountClass,acDesc,ccy,accStatus,acOpenDate,acStatNoDr,acStatNoCr,acStatDormant,acStatFrozen,nationality,accountClassDescription,drTurnover,crTurnover,inward_count_103,total_inward_amt_103,inward_monthly_avg_103,outward_count_103,total_outward_amt_103,outward_monthly_avg_103,inward_count_202,total_inward_amt_202,inward_monthly_avg_202,outward_count_202,total_outward_amt_202,outward_monthly_avg_202);

            }
        });
    }

    public void getExcelDataForUAE(MainDto mainDto){
        LOG.info("***** executing getExcelDataForUAE *****");
        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override

            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                LOG.info("Query = "+ ConfigurationHelper.getExcelQueryForUAE() );
                PreparedStatement ps = connection.prepareStatement(ConfigurationHelper.getExcelQueryForUAE());

                return ps;
            }
        },new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

                String customerNo =isNullOrEmpty (resultSet.getString("customer_no"));
                String customerType = isNullOrEmpty(resultSet.getString("customer_type"));
                String customerName1 =isNullOrEmpty (resultSet.getString("customer_name1"));
                String cifStatus = isNullOrEmpty(resultSet.getString("cif_status"));
                String cifCreationDate = isNullOrEmpty(resultSet.getString("cif_creation_date"));
                String customerCategory = isNullOrEmpty(resultSet.getString("customer_category"));
                String frozen = isNullOrEmpty(resultSet.getString("frozen"));
                String dormant = isNullOrEmpty(resultSet.getString("dormant"));
                String compMis1 = isNullOrEmpty(resultSet.getString("comp_mis_1"));
                String branchCode = isNullOrEmpty(resultSet.getString("branch_code"));
                String custAcNo = isNullOrEmpty(resultSet.getString("cust_ac_no"));
                String accountClass = isNullOrEmpty(resultSet.getString("account_class"));
                String acDesc = isNullOrEmpty(resultSet.getString("ac_desc"));
                String ccy = isNullOrEmpty(resultSet.getString("ccy"));
                String accStatus = isNullOrEmpty(resultSet.getString("acc_status"));
                String acOpenDate = isNullOrEmpty(resultSet.getString("ac_open_date"));
                String acStatNoDr = isNullOrEmpty(resultSet.getString("ac_stat_no_dr"));
                String acStatNoCr = isNullOrEmpty(resultSet.getString("ac_stat_no_cr"));
                String acStatDormant = isNullOrEmpty(resultSet.getString("ac_stat_dormant"));
                String acStatFrozen = isNullOrEmpty(resultSet.getString("ac_stat_frozen"));
                String nationality = isNullOrEmpty(resultSet.getString("nationality"));
                String accountClassDescription = isNullOrEmpty(resultSet.getString("ACCOUNT_CLASS_DESCRIPTION"));
                double drTurnover = resultSet.getDouble("DR_TURNOVER");
                double crTurnover = resultSet.getDouble("CR_TURNOVER");
                String inward_count_103 = isNullOrEmpty(resultSet.getString("inward_count_103"));
                String total_inward_amt_103 = isNullOrEmpty(resultSet.getString("total_inward_amt_103"));

                String inward_monthly_avg_103 = isNullOrEmpty(resultSet.getString("inward_monthly_avg_103"));
                String outward_count_103 = isNullOrEmpty(resultSet.getString("outward_count_103"));
                String total_outward_amt_103 = isNullOrEmpty(resultSet.getString("total_outward_amt_103"));
                String outward_monthly_avg_103 = isNullOrEmpty(resultSet.getString("outward_monthly_avg_103"));
                String inward_count_202 = isNullOrEmpty(resultSet.getString("inward_count_202"));
                String total_inward_amt_202 = isNullOrEmpty(resultSet.getString("total_inward_amt_202"));
                String inward_monthly_avg_202 = isNullOrEmpty(resultSet.getString("inward_monthly_avg_202"));
                String outward_count_202 = isNullOrEmpty(resultSet.getString("outward_count_202"));
                String total_outward_amt_202 = isNullOrEmpty(resultSet.getString("total_outward_amt_202"));
                String outward_monthly_avg_202 = isNullOrEmpty(resultSet.getString("outward_monthly_avg_202"));


                mainDto.papulateUAEExcelData(++SLNoForUAE,customerNo,customerType,customerName1,cifStatus,cifCreationDate,customerCategory,frozen,dormant,compMis1,branchCode,custAcNo,accountClass,acDesc,ccy,accStatus,acOpenDate,acStatNoDr,acStatNoCr,acStatDormant,acStatFrozen,nationality,accountClassDescription,drTurnover,crTurnover,inward_count_103,total_inward_amt_103,inward_monthly_avg_103,outward_count_103,total_outward_amt_103,outward_monthly_avg_103,inward_count_202,total_inward_amt_202,inward_monthly_avg_202,outward_count_202,total_outward_amt_202,outward_monthly_avg_202);

          }
        });
    }


    public String isNullOrEmpty(String value) {
        if (value == null || value.isEmpty() || value.equalsIgnoreCase("\"\"")) {
            return " ";
        } else
            return value;
    }

}
