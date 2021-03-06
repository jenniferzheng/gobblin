package org.apache.gobblin.compaction.suite;

import org.apache.gobblin.annotation.Alias;
import org.apache.gobblin.configuration.State;


public class TestCompactionSuiteFactories {
  public static final String DATASET_SUCCESS = "Identity/MemberAccount/minutely/2017/04/03/22";
  public static final String DATASET_FAIL= "Identity/MemberAccount/minutely/2017/04/03/23";
  /**
   * Test hive registration failure
   */
  @Alias("HiveRegistrationFailureFactory")
  public static class HiveRegistrationFailureFactory extends CompactionAvroSuiteFactory {
    public TestCompactionSuites.HiveRegistrationCompactionSuite createSuite (State state) {
      return new TestCompactionSuites.HiveRegistrationCompactionSuite(state);
    }
  }
}