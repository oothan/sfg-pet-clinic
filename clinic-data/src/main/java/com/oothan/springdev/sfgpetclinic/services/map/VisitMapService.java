package com.oothan.springdev.sfgpetclinic.services.map;

import com.oothan.springdev.sfgpetclinic.models.Visit;
import com.oothan.springdev.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created By oothan on Jul, 2022
 */
@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {
 @Override
 public Set<Visit> findAll() {
  return super.findAll();
 }

 @Override
 public void deleteById(Long id) {
  super.deleteById(id);
 }

 @Override
 public void delete(Visit visit) {
  super.delete(visit);
 }

 @Override
 public Visit save(Visit visit) {
  if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null || visit.getPet().getOwner().getId() == null) {
   throw new RuntimeException("Invalid Visit.");
  }
  return super.save(visit);
 }

 @Override
 public Visit findById(Long id) {
  return super.findById(id);
 }
}
