package ma.hay.usermanagement.presentation.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import static lombok.AccessLevel.PRIVATE;

@ConfigurationProperties(prefix = "swagger.ui")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
public class SwaggerProperties {
    String title = "Gestion utilisateurs";
    String description = "Ajout et liste des utilisateurs";
    String version = "1.0.0";
    String contactName = "Houssine AYADI";
    String contactUrl = "http://houssine-ayadi.com";
    String contactEmail = "houssine.ayadi@gmail.com";
}
