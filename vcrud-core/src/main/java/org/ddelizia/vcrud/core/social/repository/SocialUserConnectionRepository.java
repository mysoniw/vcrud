package org.ddelizia.vcrud.core.social.repository;

import org.ddelizia.vcrud.core.social.repository.custom.SocialUserConnectionRepositoryCustom;
import org.ddelizia.vcrud.core.social.model.SocialUserConnection;
import org.ddelizia.vcrud.core.usermanagement.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ddelizia
 * Date: 31/01/14
 * Time: 11:44
 * To change this template use File | Settings | File Templates.
 */
public interface SocialUserConnectionRepository extends MongoRepository<SocialUserConnection,String>, SocialUserConnectionRepositoryCustom{

    @Query(value="{ 'user.name' : ?0 }")
    public List<SocialUserConnection> findByUserName (String userName);

    @Query(value="{ 'user.name' : ?0 , 'providerId' : ?1 }")
    public List<SocialUserConnection> findByUserNameAndProviderId (String username, String providerId);

    @Query(value="{ 'user.name' : ?0 , 'providerId' : ?1 , 'providerUserId' : ?2 }")
    public SocialUserConnection findByUserNameAndProviderIdAndProviderUserId (String username, String providerId, String providerUserId);

    public List<SocialUserConnection> findByProviderIdAndProviderUserId(String providerId, String providerUserId);

    public List<SocialUserConnection> findByUser (User user);


}
