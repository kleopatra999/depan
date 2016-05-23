package com.google.devtools.depan.filesystem;

import com.google.devtools.depan.filesystem.graph.FileSystemRelation;
import com.google.devtools.depan.graph.api.Relation;
import com.google.devtools.depan.graph.registry.RelationContributor;

import java.util.Arrays;
import java.util.Collection;

public class FileSystemRelationContributor implements RelationContributor {

  public static final String ID =
      "com.google.devtools.depan.filesystem.FileSystemRelationContributor";

  @Override
  public Collection<? extends Relation> getRelations() {
    return Arrays.asList(FileSystemRelation.values());
  }
}