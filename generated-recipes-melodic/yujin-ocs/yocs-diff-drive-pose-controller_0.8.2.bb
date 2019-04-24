# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A controller for driving a differential drive base to a pose goal or along a path specified by multiple poses.     A pose consists of a 2D position (x,y) and a 1D orientation (theta)."
AUTHOR = "Marcus Liebhardt <marcus.liebhardt@yujinrobot.com>"
ROS_AUTHOR = "Marcus Liebhardt"
HOMEPAGE = "http://ros.org/wiki/yocs_diff_drive_pose_controller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "yujin_ocs"
ROS_BPN = "yocs_diff_drive_pose_controller"

ROS_BUILD_DEPENDS = " \
    ecl-threads \
    geometry-msgs \
    nodelet \
    pluginlib \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    yocs-controllers \
    yocs-math-toolkit \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ecl-threads \
    geometry-msgs \
    nodelet \
    pluginlib \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    yocs-controllers \
    yocs-math-toolkit \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-threads \
    geometry-msgs \
    nodelet \
    pluginlib \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    yocs-controllers \
    yocs-math-toolkit \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_diff_drive_pose_controller/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "be3dc89d1b5117429cf5ae6d40cfe4b7"
SRC_URI[sha256sum] = "fbe23c95911cfbb840e28142bf91da168207ff3cde4ef61f703674672c2e5431"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_diff_drive_pose_controller-0.8.2-0"

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
