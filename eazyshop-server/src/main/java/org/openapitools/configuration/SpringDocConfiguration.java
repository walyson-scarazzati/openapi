package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("EasyShop Products APIs Specification")
                                .description("# About Us **EazyShop** is a open market product selling company. Any website can list our products by  using our _APIs_. Shipping & other logistics will be taken care by us. You will get an `Affiliate commision` for selling our products. # Categories suported   - Mobiles     - Apple     - Samsung     - OnePlus   - Laptops   - Televisions   - Headphones ")
                                .termsOfService("https://eazyshop.com/terms/")
                                .contact(
                                        new Contact()
                                                .name("API Support")
                                                .url("https://www.eazyshop.com/support")
                                                .email("support@eazyshop.com")
                                )
                                .license(
                                        new License()
                                                .name("EazyShop License")
                                                .url("https://www.eazyshop.com/licenses/LICENSE-2.0.html")
                                )
                                .version("0.0.1")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("BasicAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("basic")
                                )
                                .addSecuritySchemes("BearerAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                )
                                .addSecuritySchemes("ApiKeyAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.APIKEY)
                                        .in(SecurityScheme.In.HEADER)
                                        .name("X-API-KEY")
                                )
                                .addSecuritySchemes("oAuth2AuthCode", new SecurityScheme()
                                        .type(SecurityScheme.Type.OAUTH2)
                                )
                )
        ;
    }
}