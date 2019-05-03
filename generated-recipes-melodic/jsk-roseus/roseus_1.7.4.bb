# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "EusLisp client for ROS Robot Operating System."
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://pr.willowgarage.com/wiki/roseus"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "roseus"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    actionlib-tutorials \
    angles \
    coreutils \
    dynamic-reconfigure \
    euslisp \
    geneus \
    geometry-msgs \
    jskeus \
    message-generation \
    mk \
    rosbash \
    rosbuild \
    roscpp \
    roslang \
    rosmsg \
    rosnode \
    rospack \
    rostest \
    rostopic \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    actionlib-tutorials \
    dynamic-reconfigure \
    euslisp \
    geneus \
    geometry-msgs \
    jskeus \
    message-runtime \
    rosbash \
    roscpp \
    roslang \
    rosmsg \
    rosnode \
    rospack \
    rostest \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    actionlib-tutorials \
    dynamic-reconfigure \
    euslisp \
    geneus \
    geometry-msgs \
    jskeus \
    message-runtime \
    rosbash \
    roscpp \
    roslang \
    rosmsg \
    rosnode \
    rospack \
    rostest \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
    tf2-ros \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    xvfb \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_roseus-release/archive/release/melodic/roseus/1.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "73377eb7303704b3ba90a835f2deaba0"
SRC_URI[sha256sum] = "e68ad89c7896f6b30f8a8dea7b8a0216dc5bfad5988cf8f287dd148069f5ccd1"
S = "${WORKDIR}/jsk_roseus-release-release-melodic-roseus-1.7.4-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('jsk-roseus', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-roseus/jsk-roseus_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-roseus/jsk-roseus-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-roseus/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-roseus/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
