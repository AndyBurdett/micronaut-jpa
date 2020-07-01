package sh.platform.micronaut;

import io.micronaut.data.repository.CrudRepository;

public interface HeroRepository extends CrudRepository<Hero, Long> {
}
