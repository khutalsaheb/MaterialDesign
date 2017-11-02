package com.khutal.sandesh.helper;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;

import com.khutal.sandesh.R;
import com.vansuita.materialabout.builder.AboutBuilder;
import com.vansuita.materialabout.views.AboutView;
import com.crashlytics.android.answers.Answers;
import io.fabric.sdk.android.Fabric;

public class SampleHelper implements View.OnClickListener{

    private Activity activity;
    private static int theme = R.style.AppThemeDark;

    private SampleHelper(Activity activity) {
        this.activity = activity;
    }

    public static SampleHelper with(Activity activity){
        return new SampleHelper(activity);
    }

    public SampleHelper init(){

        activity.setTheme(theme);

        activity.findViewById(R.id.dark).setOnClickListener(this);
        activity.findViewById(R.id.light).setOnClickListener(this);
        activity.findViewById(R.id.custom).setOnClickListener(this);

        return this;
    }

    public void loadAbout() {
        final FrameLayout flHolder = activity.findViewById(R.id.about);

        AboutBuilder builder = AboutBuilder.with(activity)
                .setAppIcon(R.mipmap.ic_launcher)
                .setAppName(R.string.app_name)
                .setPhoto(R.mipmap.ic_launcher)
                .setCover(R.mipmap.profile_cover)
                .setLinksAnimated(true)
                .setDividerDashGap(13)
                .setName("Sandesh Khutal")
                .setSubTitle("Mobile Developer")
                .setLinksColumnsCount(4)
                .setBrief("I'm warmed of mobile technologies. Ideas maker, curious and nature lover.")
                .addGitHubLink("khutalsaheb")
                .addBitbucketLink("Sandesh_Khutal")
                .addFacebookLink("Sandesh-Khutal")
                .addTwitterLink("khutalsaheb")
                .addInstagramLink("khutalsaheb")
                .addGooglePlusLink("112242452138596994742")
                //.addYoutubeChannelLink("CaseyNeistat")
              //  .addDribbbleLink("user")
                .addLinkedInLink("sandeshkhutal")
                .addEmailLink("khutalsaheb@gmail.com")
                .addWhatsappLink("Sandesh KhutalSaheb", "+918554847034")
                .addSkypeLink("sandesh khutal")
                .addGoogleLink("sandesh khutal")
                .addAndroidLink("user")
                .addWebsiteLink("http://androidt20.blogspot.in/")
                .addFiveStarsAction()
               .addMoreFromMeAction("Sandesh Khutal")
                .setVersionNameAsAppSubTitle()
                .addShareAction(R.string.app_name)
                .addUpdateAction()
                .setActionsColumnsCount(2)
                .addFeedbackAction("khutalsaheb@gmail.com")
             //   .addPrivacyPolicyAction("http://www.docracy.com/2d0kis6uc2")
                .addIntroduceAction((Intent) null)
                .addHelpAction((Intent) null)
                .addChangeLogAction((Intent) null)
                .addRemoveAdsAction((Intent) null)
                .addDonateAction((Intent) null)
                .setWrapScrollView(true)
                .setShowAsCard(true);

        AboutView view = builder.build();

        flHolder.addView(view);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.dark:
                if (theme != R.style.AppThemeDark) {
                    theme = R.style.AppThemeDark;
                    activity.recreate();
                }
                break;
            case R.id.light:
                if (theme != R.style.AppThemeLight) {
                    theme = R.style.AppThemeLight;
                    activity.recreate();
                }
                break;

            case R.id.custom:
                if (theme != R.style.AppThemeCustom) {
                    theme = R.style.AppThemeCustom;
                    activity.recreate();
                }
                break;

            default:
                break;
        }
    }
}
