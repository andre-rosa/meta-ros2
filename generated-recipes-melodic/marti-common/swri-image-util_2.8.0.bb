# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "swri_image_util"
AUTHOR = "Kris Kozak <kkozak@swri.org>"
HOMEPAGE = "https://github.com/swri-robotics/marti_common"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "swri_image_util"

ROS_BUILD_DEPENDS = " \
    camera-calibration-parsers \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    image-transport \
    libeigen \
    message-filters \
    nav-msgs \
    nodelet \
    roscpp \
    rospy \
    std-msgs \
    swri-geometry-util \
    swri-math-util \
    swri-nodelet \
    swri-opencv-util \
    swri-roscpp \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    pkgconfig-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-calibration-parsers \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    image-transport \
    libeigen \
    message-filters \
    nav-msgs \
    nodelet \
    roscpp \
    rospy \
    std-msgs \
    swri-geometry-util \
    swri-math-util \
    swri-opencv-util \
    swri-roscpp \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-calibration-parsers \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    image-transport \
    libeigen \
    message-filters \
    nav-msgs \
    nodelet \
    roscpp \
    rospy \
    std-msgs \
    swri-geometry-util \
    swri-math-util \
    swri-opencv-util \
    swri-roscpp \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_image_util/2.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "52d64b3c4133cca20502c65da4a4a422"
SRC_URI[sha256sum] = "3a7e532504ecfbeb15fbbb88f5dfb42f8d63a8fe946cbf7aa339a3d52f257653"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_image_util-2.8.0-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('marti-common', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-common/marti-common_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-common/marti-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-common/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
