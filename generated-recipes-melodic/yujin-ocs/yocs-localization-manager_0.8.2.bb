# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Localization Manager helps to localize robot's position with annotated information"
AUTHOR = "Jihoon Lee <jihoonl@yujinrobot.com>"
ROS_AUTHOR = "Jihoon Lee"
HOMEPAGE = "http://wiki.ros.org/yocs_localization_manager"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "yujin_ocs"
ROS_BPN = "yocs_localization_manager"

ROS_BUILD_DEPENDS = " \
    roslint \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    ar-track-alvar \
    ar-track-alvar-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    rospy \
    std-msgs \
    tf \
    yocs-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    ar-track-alvar \
    ar-track-alvar-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    rospy \
    std-msgs \
    tf \
    yocs-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_localization_manager/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c4bcf5c0966f13184383f1d5216db39a"
SRC_URI[sha256sum] = "eb2e39a17f8f78cbe98c04b73a63d666fb5937156490539ae49ad1e94b607a49"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_localization_manager-0.8.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('yujin-ocs', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('yujin-ocs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/yujin-ocs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/yujin-ocs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yujin-ocs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}