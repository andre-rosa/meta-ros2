# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The tuw_marker_detection package"
AUTHOR = "Markus Bader <markus.bader@tuwien.ac.at>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_BPN = "tuw_marker_detection"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    tuw-aruco \
    tuw-checkerboard \
    tuw-ellipses \
    tuw-marker-pose-estimation \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    tuw-aruco \
    tuw-checkerboard \
    tuw-ellipses \
    tuw-marker-pose-estimation \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tuw-robotics/tuw_marker_detection-release/archive/release/melodic/tuw_marker_detection/0.1.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c277deff5d56bfa8e7cb38edff0a670f"
SRC_URI[sha256sum] = "4b831ec3d6f8678dad02b5e96201e7944af7210da72b19a90d72d48ed4628ec9"
S = "${WORKDIR}/tuw_marker_detection-release-release-melodic-tuw_marker_detection-0.1.1-1"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/tuw-marker-detection/tuw-marker-detection_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/tuw-marker-detection/tuw-marker-detection_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tuw-marker-detection/tuw-marker-detection-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tuw-marker-detection/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tuw-marker-detection/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
