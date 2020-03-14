package com.finalproject.automated.refactoring.tool.refactoring.service;

import com.finalproject.automated.refactoring.tool.model.MethodModel;
import com.finalproject.automated.refactoring.tool.duplicate.code.detection.model.ClonePair;
import lombok.NonNull;

import java.util.List;
import java.util.Map;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

public interface Refactoring {

    Map<String, Map<String, List<MethodModel>>> refactoring(@NonNull String path,
                                                            @NonNull List<MethodModel> methodModels);

    Map<String, Map<String, List<MethodModel>>> refactoring(@NonNull Map<String, List<MethodModel>> methods);

    void refactoringDuplicate(@NonNull String path, @NonNull List<ClonePair> clonePairs);

    void refactoringDuplicate(@NonNull Map<String, List<ClonePair>> clonePairs);
}
