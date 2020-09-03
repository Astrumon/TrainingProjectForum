package com.skidchenko.DAOLayer.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@EnableJpaRepositories("com.skidchenko.DAOLayer.SpringDataRepository")
@ComponentScan("com.skidchenko.LogicLayer.Controllers")


public class SpringConfig {



   /* @Bean
    public DAOFactory daoFactory() {
        System.out.println("DAOFactory is configured!");

        return new DAOFactory();
    }

    @Bean
    public ConnectionSource connectionSource() {
        System.out.println("ConnectionSource is configured!");

        return new ConnectionFactory();
    }


    @Bean
    public UserDAO userDAO() {
        System.out.println("UserDAO is configured!");
        return (UserDAO) daoFactory().getDao(User.class);
    }

    @Bean
    public NoteDAO noteDAO() {
        System.out.println("NoteDAO is confiured!");
        return (NoteDAO) daoFactory().getDao(Note.class);
    }

    @Bean
    public MessageDAO messageDAO() {
        System.out.println("MessageDAO is configured!");
        return (MessageDAO) daoFactory().getDao(Message.class);
    }
*/

}
