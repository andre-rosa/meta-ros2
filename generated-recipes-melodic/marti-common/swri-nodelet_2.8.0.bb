# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a simple script to write simple launch files     that can easily switch between running nodelets together or as     standalone nodes."
AUTHOR = "P. J. Reed <preed@swri.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    nodelet \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    nodelet \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    nodelet \
    rosbash \
    roscpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosbash \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_nodelet/2.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7da0937af807bb74c2cae3d7f0e77772"
SRC_URI[sha256sum] = "028628e0bc364e9be5f608663cf49c988db0599bad0a534b9f1d4f707749a5a0"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_nodelet-2.8.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/marti-common/marti-common_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/marti-common/marti-common_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-common/marti-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/marti-common/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
