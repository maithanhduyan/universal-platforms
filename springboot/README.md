# [Building an Application with Spring Boot]('https://spring.io/projects/spring-boot')


# Architect

- Core: core library
- Shop: references core
### References
- [Wiki]('https://en.wikipedia.org/wiki/Box-drawing_character')
- [Wiki Arrow]('https://en.wikipedia.org/wiki/Arrow_(symbol)')
- [alt-codes.net]('https://www.alt-codes.net/arrow_alt_codes.php')
~~~~
        
    ┌───────────────────┐
    │       SHOP UI     │--> Shop [Springboot]
    └───────────────────┘
              ⇵
    ┌───────────────────┐
    │ DATA ACCESS LAYER │--> Core[Java Maven project]
    └───────────────────┘
              ⇵
    ┌───────────────────┐
    │      DATABASE     │--> PostgreSQL
    └───────────────────┘

~~~~
[Three-tier architecture]('https://en.wikipedia.org/wiki/Multitier_architecture#:~:text=Three%2Dtier%20architecture%20is%20a,most%20often%20on%20separate%20platforms.')

~~~~
    3- TIER LAYER ARCHITECTURE
    ┌───────────────────┐
    │ PRESENTATION TIER │
    └───────────────────┘
              ⇵
    ┌───────────────────┐
    │    LOGIC TIER     │
    └───────────────────┘
              ⇵
    ┌───────────────────┐
    │    DATA TIER      │
    └───────────────────┘

~~~~