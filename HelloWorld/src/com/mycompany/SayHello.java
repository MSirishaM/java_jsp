package com.mycompany;

import java.io.IOException;
import java.io.PrintWriter;
public class SayHello extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>Hello World!</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<h1>Hello World!</h1>");
//        out.println("</body>");
//        out.println("</html>");
        out.println("{\n" +
                "\"report\": {\n" +
                "\"analyseInfo\": \"体温 ● 正常 ○ 异常     体重 18kg  血压    疼痛 ● 无 ○ 有        营养筛查 ● 正常 ○ 异常      康复需求 ● 正常 ○ 异常       跌落风险 ● 无 ○ 有    经济评估   文化程度   社会评估\",\n" +
                "\"analyseInfoScui\": \"703421000|27113001|421379005|421825006|258683005|75367002|22253000|384759009|105499002|1912002|90569008|246173007\",\n" +
                "\"auxiliaryExamination\": \"\",\n" +
                "\"cardNo\": \"4401000012097959\",\n" +
                "\"complaint\": \"复查双眼结膜炎，已不眨眼少许揉眼。\",\n" +
                "\"complaintScui\": \"81745001|9826008|3585009|81745001\",\n" +
                "\"date\": \"\",\n" +
                "\"diagnosis\": \"结膜炎\",\n" +
                "\"diagnosisScui\": \"9826008\",\n" +
                "\"icd10Id\": \"H10.900\",\n" +
                "\"icd10Name\": \"结膜炎\",\n" +
                "\"icd10NameScui\": \"9826008\",\n" +
                "\"id\": \"8793\",\n" +
                "\"note\": \"\",\n" +
                "\"opinions\": \"Rx 1. 吡嘧司特钾滴眼液 10ml:10mg/支                          每次用1滴 滴眼 tid 共1支 1天()                  加替沙星滴眼液 8ml:24mg/瓶                            每次用1滴 滴眼 tid 共1瓶 1天()                  消旋山莨菪碱滴眼液 8ml:4mg/瓶                          每次用1滴 滴眼 qd 共1瓶 1天(睡前一次)\",\n" +
                "\"opinionsScui\": \"257974004|421806008|421379005|417508009|88480006|81745001|420258001|258669008|258770004|420258001|258684004|421379005|81745001|257998006|257989008|257986001|421379005|421379005|20401003|128489003|81745001|421825006|258669008|258770004|420797005|421534005|258684004|421379005|81745001|257998006|257989008|257986001|421379005|421379005|387409009|81745001|421825006|258669008|258770004|421534005|258684004|421379005|81745001|257995009|257986001|421379005|421379005|38112003\",\n" +
                "\"patName\": \"李梓涵\",\n" +
                "\"physicalExamination\": \"双眼正位，双眼向各个方向运动正常。双眼外观正常，双眼下睑结膜充血+，结膜结石，双侧角膜透明，瞳孔直间接对光反射灵敏。\",\n" +
                "\"physicalExaminationScui\": \"81745001|81745001|56219004|81745001|703248002|81745001|62736007|193894004|260347006|13706005|51440002|1483009|35146001|106146005\",\n" +
                "\"presentHistory\": \"复查双眼结膜炎，已不眨眼少许揉眼。\",\n" +
                "\"presentHistoryScui\": \"81745001|9826008|3585009|81745001\",\n" +
                "\"regDate\": \"2016/5/4 08:14:00\",\n" +
                "\"signature\": \"眼科(儿)   医师签名： 毛娅妮  签署日期 ： 2016-05-04\",\n" +
                "\"sourceFile\": \"结膜炎门诊病历.json\",\n" +
                "\"visitNo\": \"20160504Y01698\"\n" +
                "}\n" +
                "}");
    }
}