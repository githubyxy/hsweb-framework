/*
 * Copyright 2020 http://www.hswebframework.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.hswebframework.web.authorization;

/**
 * 用户信息
 *
 * @author zhouhao
 * @since 3.0
 */
public interface User extends Dimension {
    /**
     * @return 用户ID
     */
    String getId();

    /**
     * @return 用户名
     */
    String getUsername();

    /**
     * @return 姓名
     */
    String getName();

    /**
     * @return 用户类型
     */
    String getUserType();

    /**
     * @return 用户状态
     */
    Byte getStatus();

    @Override
    default DimensionType getType() {
        return DefaultDimensionType.user;
    }
}
