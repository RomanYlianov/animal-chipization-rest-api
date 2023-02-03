package com.example.demo.config;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Slf4j
@Component
public class AccountConverter implements Converter<String, Account> {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account convert(String source) {
        log.info("get account information");
        Account entity = null;
        if (source!=null || !source.equals(""))
        {
            Optional<Account> account = Optional.empty();
            try{
                Integer id = Integer.parseInt(source);
                account = accountRepository.findById(id);
                if (account.isPresent())
                    entity = account.get();
            }
            catch (Exception e)
            {
                log.error(e.getStackTrace().toString());
            }
        }
        else {
            log.warn("input data is empty");
        }
        return entity;
    }
}