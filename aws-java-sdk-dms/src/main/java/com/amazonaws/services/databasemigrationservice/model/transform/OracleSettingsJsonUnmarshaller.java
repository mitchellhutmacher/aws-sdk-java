/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OracleSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OracleSettingsJsonUnmarshaller implements Unmarshaller<OracleSettings, JsonUnmarshallerContext> {

    public OracleSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        OracleSettings oracleSettings = new OracleSettings();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AsmPassword", targetDepth)) {
                    context.nextToken();
                    oracleSettings.setAsmPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AsmServer", targetDepth)) {
                    context.nextToken();
                    oracleSettings.setAsmServer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AsmUser", targetDepth)) {
                    context.nextToken();
                    oracleSettings.setAsmUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    oracleSettings.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Password", targetDepth)) {
                    context.nextToken();
                    oracleSettings.setPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    oracleSettings.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SecurityDbEncryption", targetDepth)) {
                    context.nextToken();
                    oracleSettings.setSecurityDbEncryption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityDbEncryptionName", targetDepth)) {
                    context.nextToken();
                    oracleSettings.setSecurityDbEncryptionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    context.nextToken();
                    oracleSettings.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    oracleSettings.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return oracleSettings;
    }

    private static OracleSettingsJsonUnmarshaller instance;

    public static OracleSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OracleSettingsJsonUnmarshaller();
        return instance;
    }
}
