package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(path = "/api2")
public class TestController {
    Logger log = LoggerFactory.getLogger(TestController.class);

    @PostMapping(path = "/answer1")
    public String test1(HttpServletRequest request) {

        log.info("Request Received /api :");
        log.info("Verb: {}", request.getMethod());
        log.info("URL: {}", request.getRequestURL());
        log.info("Host: {}", request.getRemoteHost());

        return "Test success 1";
    }

    @GetMapping(path = "/answer2")
    public String test2(HttpServletRequest request) {

        log.info("Request Received /api :");
        log.info("Verb: {}", request.getMethod());
        log.info("URL: {}", request.getRequestURL());
        log.info("Host: {}", request.getRemoteHost());

        return "Test success 2";
    }

    @PutMapping(path = "/{id}")
    public String test3(HttpServletRequest request) {

        log.info("Request Received /api :");
        log.info("Verb: {}", request.getMethod());
        log.info("URL: {}", request.getRequestURL());
        log.info("Host: {}", request.getRemoteHost());

        return "Test success 3";
    }

    @GetMapping("/{id}/answer5")
    public String findById2(
            @PathVariable long id, HttpServletRequest request) {


        log.info("Request Received /api :");
        log.info("Verb: {}", request.getMethod());
        log.info("URL: {}", request.getRequestURL());
        log.info("Host: {}", request.getRemoteHost());

        /*
        log.info("Request Received /api :");
        log.info("Verb: {}", request.getMethod());
        log.info("URL: {}", request.getRequestURL());
        log.info("Host: {}", request.getRemoteHost());
        log.info(example);

        Enumeration<String> nameHeaders = request.getHeaderNames();
        while (nameHeaders.hasMoreElements()) {
            String name = nameHeaders.nextElement();
            Enumeration<String> valueHeaders = request.getHeaders(name);
            while (valueHeaders.hasMoreElements()) {
                String value = valueHeaders.nextElement();
                log.info("Key: {}, Value: {}", name, value);
            }
        }

        try {
            log.info("Body: ");
            body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
            log.info(body);
        } catch (Exception e) {
            log.info("Exception: {}", e.getMessage());
        }
*/


        return "Test success 5";
    }

    @PostMapping("/{id}/answer6/{example}")
    public ResponseEntity  findById3(
            @PathVariable long id,
            @PathVariable String example,
            HttpServletRequest request) {
        return ResponseEntity.ok("{\"empresa\":{\"codigo\":\"ERHV\",\"orden\":76,\"tipoEmpresa\":\"G\",\"nombre\":\"GCBA No Tributarios\"," +
                "\"tituloIdentificacion\":\"Cod.pagos por redes(ptes)\",\"permiteUsd\":false,\"tipoPago\":3,\"soloConsultas\":false," +
                "\"permiteDobleFacturacion\":true,\"importePermitido\":0,\"codigoMoneda\":1,\"datoAdicional\":\"\",\"tarjetasPermitidas\":[\"13\",\"43\"]," +
                "\"montoMinimoTC\":0,\"montoMaximoTC\":0,\"rubro\":{\"idRubro\":\"MCPS\",\"tipo\":\"0\",\"nombre\":\"Impuestos Municipales\"}," +
                "\"permitePagosTCV\":false,\"permitePagosTCM\":false,\"permitePagosTCA\":false,\"permitePagosTDV\":true,\"permitePagosTDM\":true," +
                "\"rubroID\":\"MCPS\"},\"fechaPago\":\"2019-11-13T18:20:34.000+0000\",\"transacNum\":\"9413\",\"controlNum\":\"4313\"," +
                "\"idDeuda\":\"00100026137501\",\"descDeuda\":\"GCBA NO TRIBU\",\"leyPago\":\"COMPROBANTE VALIDO DE PAGO.CONSERVELO.\"," +
                "\"leyAdhesion\":\"Pagos GCBA INT RegCiv\",\"monto\":315,\"moneda\":32,\"cuenta\":{\"numero\":\"0\",\"tipo\":\"0\"," +
                "\"moneda\":\"0\",\"cbu\":\"\",\"estado\":\"0\",\"saldo\":0,\"limite\":0,\"intereses\":0,\"ctaEspecial\":false}," +
                "\"tarjeta\":{\"nroTarjeta\":\"Visa D\u00e9bito XXXX-1408\",\"codigoMedioDePago\":\"03\",\"cuotas\":\"01\",\"tipoTarjeta\":\"TD\"," +
                "\"tipoTarjetaPMC\":\"tdv\",\"idMedioDePago\":\"43\"},\"hostOnLine\":false,\"prePago\":false}");

    }


}
