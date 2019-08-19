package com.finalproject.automated.refactoring.tool.refactoring.model;

import com.finalproject.automated.refactoring.tool.model.MethodModel;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

@Data
@Builder
public class SaveFailsVA {

    private String path;

    private String codeSmellName;

    private MethodModel methodModel;

    private Map<String, Map<String, List<MethodModel>>> refactoringFailures;
}
