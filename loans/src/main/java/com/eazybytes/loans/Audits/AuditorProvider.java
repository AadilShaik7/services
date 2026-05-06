package com.eazybytes.loans.Audits;

import org.jspecify.annotations.NullMarked;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class AuditorProvider implements AuditorAware<String> {

    @Override
    @NullMarked
    public Optional<String> getCurrentAuditor() {
        return Optional.of("SYSTEM");
    }
}