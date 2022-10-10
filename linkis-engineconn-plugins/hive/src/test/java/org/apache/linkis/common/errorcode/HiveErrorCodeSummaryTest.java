/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.linkis.common.errorcode;

import org.junit.jupiter.api.Test;

import static org.apache.linkis.engineplugin.hive.errorcode.HiveErrorCodeSummary.CREATE_HIVE_EXECUTOR_ERROR;
import static org.apache.linkis.engineplugin.hive.errorcode.HiveErrorCodeSummary.GET_FIELD_SCHEMAS_ERROR;
import static org.apache.linkis.engineplugin.hive.errorcode.HiveErrorCodeSummary.HIVE_EXEC_JAR_ERROR;
import static org.apache.linkis.engineplugin.hive.errorcode.HiveErrorCodeSummary.INVALID_VALUE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HiveErrorCodeSummaryTest {
  @Test
  void testGetErrorCode() {
    assertEquals(26040, CREATE_HIVE_EXECUTOR_ERROR.getErrorCode());
    assertEquals(26041, HIVE_EXEC_JAR_ERROR.getErrorCode());
    assertEquals(26042, GET_FIELD_SCHEMAS_ERROR.getErrorCode());
    assertEquals(26043, INVALID_VALUE.getErrorCode());
  }

  @Test
  void testSetErrorCode() {
    CREATE_HIVE_EXECUTOR_ERROR.setErrorCode(1);
    assertEquals(1, CREATE_HIVE_EXECUTOR_ERROR.getErrorCode());
    CREATE_HIVE_EXECUTOR_ERROR.setErrorCode(26040);
    assertEquals(26040, CREATE_HIVE_EXECUTOR_ERROR.getErrorCode());

    HIVE_EXEC_JAR_ERROR.setErrorCode(1);
    assertEquals(1, HIVE_EXEC_JAR_ERROR.getErrorCode());
    HIVE_EXEC_JAR_ERROR.setErrorCode(26041);
    assertEquals(26041, HIVE_EXEC_JAR_ERROR.getErrorCode());

    GET_FIELD_SCHEMAS_ERROR.setErrorCode(1);
    assertEquals(1, GET_FIELD_SCHEMAS_ERROR.getErrorCode());
    GET_FIELD_SCHEMAS_ERROR.setErrorCode(26042);
    assertEquals(26042, GET_FIELD_SCHEMAS_ERROR.getErrorCode());

    INVALID_VALUE.setErrorCode(1);
    assertEquals(1, INVALID_VALUE.getErrorCode());
    INVALID_VALUE.setErrorCode(26043);
    assertEquals(26043, INVALID_VALUE.getErrorCode());
  }

  @Test
  void testGetErrorDesc() {
    assertEquals(
        "failed to create hive executor(创建hive执行器失败)", CREATE_HIVE_EXECUTOR_ERROR.getErrorDesc());
    assertEquals(
        "cannot find hive-exec.jar, start session failed(找不到 hive-exec.jar，启动会话失败)",
        HIVE_EXEC_JAR_ERROR.getErrorDesc());
    assertEquals("cannot get the field schemas(无法获取字段模式)", GET_FIELD_SCHEMAS_ERROR.getErrorDesc());
    assertEquals("invalid value(无效值)", INVALID_VALUE.getErrorDesc());
  }

  @Test
  void testSetErrorDesc() {
    CREATE_HIVE_EXECUTOR_ERROR.setErrorDesc("test");
    assertEquals("test", CREATE_HIVE_EXECUTOR_ERROR.getErrorDesc());
    CREATE_HIVE_EXECUTOR_ERROR.setErrorDesc("failed to create hive executor(创建hive执行器失败)");
    assertEquals(
        "failed to create hive executor(创建hive执行器失败)", CREATE_HIVE_EXECUTOR_ERROR.getErrorDesc());

    HIVE_EXEC_JAR_ERROR.setErrorDesc("test");
    assertEquals("test", HIVE_EXEC_JAR_ERROR.getErrorDesc());
    HIVE_EXEC_JAR_ERROR.setErrorDesc(
        "cannot find hive-exec.jar, start session failed(找不到 hive-exec.jar，启动会话失败)");
    assertEquals(
        "cannot find hive-exec.jar, start session failed(找不到 hive-exec.jar，启动会话失败)",
        HIVE_EXEC_JAR_ERROR.getErrorDesc());

    GET_FIELD_SCHEMAS_ERROR.setErrorDesc("test");
    assertEquals("test", GET_FIELD_SCHEMAS_ERROR.getErrorDesc());
    GET_FIELD_SCHEMAS_ERROR.setErrorDesc("cannot get the field schemas(无法获取字段模式)");
    assertEquals("cannot get the field schemas(无法获取字段模式)", GET_FIELD_SCHEMAS_ERROR.getErrorDesc());

    INVALID_VALUE.setErrorDesc("test");
    assertEquals("test", INVALID_VALUE.getErrorDesc());
    INVALID_VALUE.setErrorDesc("invalid value(无效值)");
    assertEquals("invalid value(无效值)", INVALID_VALUE.getErrorDesc());
  }

  @Test
  void testGetComment() {
    assertEquals(
        "failed to create hive executor(创建hive执行器失败)", CREATE_HIVE_EXECUTOR_ERROR.getComment());
    assertEquals(
        "cannot find hive-exec.jar, start session failed(找不到 hive-exec.jar，启动会话失败)",
        HIVE_EXEC_JAR_ERROR.getComment());
    assertEquals("cannot get the field schemas(无法获取字段模式)", GET_FIELD_SCHEMAS_ERROR.getComment());
    assertEquals("invalid value(无效值)", INVALID_VALUE.getComment());
  }

  @Test
  void testSetComment() {
    CREATE_HIVE_EXECUTOR_ERROR.setComment("test");
    assertEquals("test", CREATE_HIVE_EXECUTOR_ERROR.getComment());
    CREATE_HIVE_EXECUTOR_ERROR.setComment("failed to create hive executor(创建hive执行器失败)");
    assertEquals(
        "failed to create hive executor(创建hive执行器失败)", CREATE_HIVE_EXECUTOR_ERROR.getComment());

    HIVE_EXEC_JAR_ERROR.setComment("test");
    assertEquals("test", HIVE_EXEC_JAR_ERROR.getComment());
    HIVE_EXEC_JAR_ERROR.setComment(
        "cannot find hive-exec.jar, start session failed(找不到 hive-exec.jar，启动会话失败)");
    assertEquals(
        "cannot find hive-exec.jar, start session failed(找不到 hive-exec.jar，启动会话失败)",
        HIVE_EXEC_JAR_ERROR.getComment());

    GET_FIELD_SCHEMAS_ERROR.setComment("test");
    assertEquals("test", GET_FIELD_SCHEMAS_ERROR.getComment());
    GET_FIELD_SCHEMAS_ERROR.setComment("cannot get the field schemas(无法获取字段模式)");
    assertEquals("cannot get the field schemas(无法获取字段模式)", GET_FIELD_SCHEMAS_ERROR.getComment());

    INVALID_VALUE.setComment("test");
    assertEquals("test", INVALID_VALUE.getComment());
    INVALID_VALUE.setComment("invalid value(无效值)");
    assertEquals("invalid value(无效值)", INVALID_VALUE.getComment());
  }

  @Test
  void testGetModule() {
    assertEquals("hiveEngine", CREATE_HIVE_EXECUTOR_ERROR.getModule());
    assertEquals("hiveEngine", HIVE_EXEC_JAR_ERROR.getModule());
    assertEquals("hiveEngine", GET_FIELD_SCHEMAS_ERROR.getModule());
    assertEquals("hiveEngine", INVALID_VALUE.getModule());
  }

  @Test
  void testSetModule() {
    CREATE_HIVE_EXECUTOR_ERROR.setModule("test");
    assertEquals("test", CREATE_HIVE_EXECUTOR_ERROR.getModule());
    CREATE_HIVE_EXECUTOR_ERROR.setModule("hiveEngine");
    assertEquals("hiveEngine", CREATE_HIVE_EXECUTOR_ERROR.getModule());

    HIVE_EXEC_JAR_ERROR.setModule("test");
    assertEquals("test", HIVE_EXEC_JAR_ERROR.getModule());
    HIVE_EXEC_JAR_ERROR.setModule("hiveEngine");
    assertEquals("hiveEngine", HIVE_EXEC_JAR_ERROR.getModule());

    GET_FIELD_SCHEMAS_ERROR.setModule("test");
    assertEquals("test", GET_FIELD_SCHEMAS_ERROR.getModule());
    GET_FIELD_SCHEMAS_ERROR.setModule("hiveEngine");
    assertEquals("hiveEngine", GET_FIELD_SCHEMAS_ERROR.getModule());

    INVALID_VALUE.setModule("test");
    assertEquals("test", INVALID_VALUE.getModule());
    INVALID_VALUE.setModule("hiveEngine");
    assertEquals("hiveEngine", INVALID_VALUE.getModule());
  }
}