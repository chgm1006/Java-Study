package junitexam.junitInAction.chap2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(AuditServiceParameterResolver.class)
public class TestOrderService {
    @Test
    public void testPlaceOrderOK(AuditService auditService) {
        assertEquals(1, 1);
        auditService.audit();
    }
}
