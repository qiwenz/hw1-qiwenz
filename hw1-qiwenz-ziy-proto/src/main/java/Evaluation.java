

/* First created by JCasGen Wed Sep 11 01:03:42 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Top N
 * Updated by JCasGen Wed Sep 11 14:37:23 EDT 2013
 * XML source: C:/Users/Chiven/git/hw1-qiwenz/hw1-qiwenz-ziy-proto/src/main/resources/hw1-qiwenz-typeSystem.xml
 * @generated */
public class Evaluation extends base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Evaluation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Evaluation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: answerscore

  /** getter for answerscore - gets 
   * @generated */
  public AnswerScore getAnswerscore() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_answerscore == null)
      jcasType.jcas.throwFeatMissing("answerscore", "Evaluation");
    return (AnswerScore)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_answerscore)));}
    
  /** setter for answerscore - sets  
   * @generated */
  public void setAnswerscore(AnswerScore v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_answerscore == null)
      jcasType.jcas.throwFeatMissing("answerscore", "Evaluation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluation_Type)jcasType).casFeatCode_answerscore, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets 
   * @generated */
  public double getPrecision() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "Evaluation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets  
   * @generated */
  public void setPrecision(double v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "Evaluation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Evaluation_Type)jcasType).casFeatCode_precision, v);}    
  }

    