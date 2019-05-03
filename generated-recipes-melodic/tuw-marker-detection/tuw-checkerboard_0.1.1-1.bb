# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The tuw_checkerboard package is designed to detect one      checkerboard and to estimate the pose of the checkerboard relative to the camera.     The detection itself is based on the opencv functions for checkerboards."
AUTHOR = "Florian Beck <florian.beck@tuwien.ac.at>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_BPN = "tuw_checkerboard"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    dynamic-reconfigure \
    image-geometry \
    image-transport \
    image-view \
    marker-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    dynamic-reconfigure \
    image-geometry \
    image-transport \
    image-view \
    marker-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    dynamic-reconfigure \
    image-geometry \
    image-transport \
    image-view \
    marker-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tuw-robotics/tuw_marker_detection-release/archive/release/melodic/tuw_checkerboard/0.1.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "408e78e156ab69f71288c87d552b62c3"
SRC_URI[sha256sum] = "e7d76c6bb8a14e31094674fc33504b7cca4335d4d0c2362ceda6811633fc483c"
S = "${WORKDIR}/tuw_marker_detection-release-release-melodic-tuw_checkerboard-0.1.1-1"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('tuw-marker-detection', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tuw-marker-detection/tuw-marker-detection_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tuw-marker-detection/tuw-marker-detection-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tuw-marker-detection/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/tuw-marker-detection/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
