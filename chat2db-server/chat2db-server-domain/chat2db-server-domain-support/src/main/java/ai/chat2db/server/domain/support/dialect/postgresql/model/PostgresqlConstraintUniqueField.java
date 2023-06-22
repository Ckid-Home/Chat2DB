/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package ai.chat2db.server.domain.support.dialect.postgresql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author jipengfei
 * @version : PostgresqlConstraintUniqueField.java, v 0.1 2022年12月11日 15:22 jipengfei Exp $
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class PostgresqlConstraintUniqueField {
    private String fieldName;
}