# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The respeaker_ros package"
AUTHOR = "Yuki Furuta <furushchev@jsk.imi.i.u-tokyo.ac.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=211ba54883815de9f52a3dcd9f281523"

ROS_BPN = "respeaker_ros"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    audio-common-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    python-numpy \
    python-pyaudio \
    python-pyusb-pip \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    audio-common-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    python-numpy \
    python-pyaudio \
    python-pyusb-pip \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/respeaker_ros/2.1.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "75252a2ba0d68a2ab3ae02dccc13fcd7"
SRC_URI[sha256sum] = "d497d9fe2e707120d60d0ce824e8476a9b65b3409d36d8e899cacc93257a56d2"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-respeaker_ros-2.1.11-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/jsk-3rdparty/jsk-3rdparty_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/jsk-3rdparty/jsk-3rdparty_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-3rdparty/jsk-3rdparty-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-3rdparty/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-3rdparty/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
