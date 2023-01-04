package hello.hellospring;

import hello.hellospring.domain.repository.JdbcMemberRepository;
import hello.hellospring.domain.repository.JdbcTemplateMemberRepository;
import hello.hellospring.domain.repository.JpaMemberRepository;
import hello.hellospring.domain.repository.MemberRepository;
import hello.hellospring.domain.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {
//    @PersistenceContext

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @Bean
    public MemberService memberService(){

        return new MemberService(memberRepository
        );
    }

//    @Bean
//    public MemberRepository memberRepository(){
//
////        return new MemoryMemberRepository();
////        return new JdbcMemberRepository(dataSource);
////        return new JdbcTemplateMemberRepository(dataSource);
////        return new JpaMemberRepository(em);
//
//    }
}