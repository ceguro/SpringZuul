# SpringZuul
Spring REST with a Zuul Proxy


when each curl is executed they are redirected to the respective controller method, the verb does not matter.

curl -X POST \                                            
          http://localhost:8081/api/first \
          -H 'Authentication: Bearer eec01d63-e4d2-46b6-b588-3a96cc713fa8' \
          -H 'Content-Type: application/json' \
          -H 'Postman-Token: 33f9a5a6-a87e-4922-93ec-0b1709288e77' \
          -H 'cache-control: no-cache' \
          -d '{
            "test": "00020101021244370007com.pmc0104ERHV02140010002624474445780008com.pmc1011219590000781402082019091903012040569900050820200922060823:59:5946640008com.pmc20121Pagos GCBA INT RegCiv0214Pagos GCBA INT030500001501500113066465826251210017ALIASCBUEJEMPLO015204970053030325406315.005802AR5917GCBANoTributarios6004CABA6216011219590000781480270008com.gcba0106905000020116304120D"
        }'


curl -X GET \                                             
          http://localhost:8081/api/second \
          -H 'Authentication: Bearer eec01d63-e4d2-46b6-b588-3a96cc713fa8' \
          -H 'Content-Type: application/json' \
          -H 'Postman-Token: 33f9a5a6-a87e-4922-93ec-0b1709288e77' \
          -H 'cache-control: no-cache' \
          -d '{
            "test": "00020101021244370007com.pmc0104ERHV02140010002624474445780008com.pmc1011219590000781402082019091903012040569900050820200922060823:59:5946640008com.pmc20121Pagos GCBA INT RegCiv0214Pagos GCBA INT030500001501500113066465826251210017ALIASCBUEJEMPLO015204970053030325406315.005802AR5917GCBANoTributarios6004CABA6216011219590000781480270008com.gcba0106905000020116304120D"
        }'
