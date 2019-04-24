# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "swri_image_util"
AUTHOR = "Kris Kozak <kkozak@swri.org>"
ROS_AUTHOR = "Kris Kozak"
HOMEPAGE = "https://github.com/swri-robotics/marti_common"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "marti_common"
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

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_image_util/2.9.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1101993abd98101c756e007907a2d02f"
SRC_URI[sha256sum] = "99128d9b1d275f8745408336b22f2b6c028acda4f0f650f78c0d9d0081b17424"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_image_util-2.9.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('marti-common', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('marti-common', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marti-common/marti-common_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marti-common/marti-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marti-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marti-common/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
