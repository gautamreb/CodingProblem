/*
package com.gautam.recursion;

import com.google.protobuf.Message;
import com.google.protobuf.Timestamp;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

@Slf4j
public class ProtoMessageSender {




    private static Message createMessage() {

        Instant currentTime = Instant.now().minusMillis(5 * 60 * 1000L);
        Timestamp currentTimestamp = Timestamp.newBuilder()
                .setSeconds(currentTime.getEpochSecond())
                .setNanos(currentTime.getNano()).build();

        Header header = Header.newBuilder()
                .setMessageId(UUID.randomUUID().toString())
                .setTransactionId(UUID.randomUUID().toString())
                .setRefNo(999999999999l)
                .setChannelId("EM")
                .setDateTime(currentTimestamp)
                .setService("PROMPTPAY")
                .build();

        Fees fees = Fees.newBuilder()
                .setPayerFeeAmount(99.99)
                .setPayerNotificationFeeAmount(9.99)
                .setPayerFeeDebitAccount("3333333333")
                .setPayeeFeeAmount(99.99)
                .build();

        PayeeInfo payeeInfo = PayeeInfo.newBuilder()
                .setPayeeName("Payee name")
                .setBankBranchNumber("1235")
                .setTaxIdentificationNumber("T123456")
                .setAddress("No 123, Street 1")
                .setProvince("Bangkok")
                .setDistrict("Yan Nawa")
                .setSubDistrict("Chong Nonsi")
                .setPostalCode("10230")
                .build();

        Wht wht = Wht.newBuilder()
                .setTaxIdentificationNumber("T123456")
                .setWhtCertificateNumber("C123456")
                .setWhtSequenceNumber("123456")
                .setWhtFormType("RD53")
                .setWhtPayType("1")
                .setPayeeInfo(payeeInfo)
                .build();

        List<Invoice> invoiceList = new ArrayList<>();
        Invoice invoice = Invoice.newBuilder()
                .setInvoiceNumber("I123456")
                .setInvoiceDate("2020-01-01")
                .setIncomeType("06")
                .setInvoiceAmountBeforeTax(999.99)
                .setInvoiceDescription("Desc")
                .setWhtAmount(99.99)
                .setWhtPercentage(9.99)
                .setVatAmount(99.99)
                .setVatPercentage(9.99)
                .build();
        invoiceList.add(invoice);

        Requesters requesters =  Requesters.newBuilder()
                .setMakerId("M12345")
                .setLastApproverId("A12345").build();

        FundTransferPromptPayData data = FundTransferPromptPayData.newBuilder()
                .setTermId("BIZNEXT")
                .setTermType("BN")
                .setCompanyId("ABCDA00003")
                .setInputTermMode("BizNext")
                .setTransferOrderId("O123456789")
                .setTransferItemId("I123456789")
                .setPaymentMethod("SINGLE")
                .setPayerAccountName("PAYER NAME")
                .setPayerAccountNumber("0020249519")
                .setPayerBankCode("006")
                .setPayerBranchCode("006")
                .setPayeeThaiName("Payee Thai name")
                .setPayeeEngName("Payee Eng name")
                .setPayeeAccountName("PAYEE NAME")
                .setPayeeAccountNumber("2222222222")
                .setPayeeBankCode("006")
                .setPayeeProxyId("0102562000063")
                .setPayeeProxyType("NATID")
                .setAmount(100.99)
                .setEffectiveDate("2020-01-01")
                .setTransactionDateTime(currentTimestamp)
                .setTransactionCreateDate("2020-12-17")
                .setRemarks("REMARKS")
                .setPayeeEmails("a@b.com,x@y.com")
                .setPayeeSms("0987654321,0123456789")
                .setFees(fees)
                .setWht(wht)
                .setRequesters(requesters)
                .addAllInvoices(invoiceList)
                .build();

        return FundTransferPromptPayMessage.newBuilder()
                .setHeader(header)
                .setData(data).build();


    }

    public static void main(String[] args) {

        Properties props = new Properties();
        //props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "kcsgtbkafkad81.vayu.local:19093");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ProtoSerializer.class);

        try (Producer<String, Message> producer = new KafkaProducer<>(props)) {
            String messageId = UUID.randomUUID().toString();

            ProducerRecord<String, Message> record = new ProducerRecord<>("COMMONSVC.TXNSUBMIT.TRANSFER.PROMPTPAY", messageId, createMessage());
            producer.send(record).get();

            log.info("Message sent successfully -> {}", messageId);

        } catch (Exception e) {
            log.error("Unable to send message", e);
        }
    }

}*/
