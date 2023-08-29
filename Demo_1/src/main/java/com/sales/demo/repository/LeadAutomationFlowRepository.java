@Repository
public interface LeadAutomationFlowRepository extends JpaRepository<LeadAutomationFlow, Long> {
 
    List<LeadAutomationFlow> findByTemplates(String templates);
 
    List<LeadAutomationFlow> findByEmailTemplate(String emailTemplate);
 
    List<LeadAutomationFlow> findByCreditType(String creditType);
 
    List<LeadAutomationFlow> findBySendPacketForm(boolean sendPacketForm);
 
    List<LeadAutomationFlow> findBySendToSalesRep(boolean sendToSalesRep);
 
    List<LeadAutomationFlow> findByMoveLeadToDeadLeads(boolean moveLeadToDeadLeads);
}